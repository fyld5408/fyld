package netty;

import java.net.InetSocketAddress;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Server {
   private int port;
   public Server(int port){
	   this.port=port;
   }
   
   public void run(){
	   EventLoopGroup bossGroup=new NioEventLoopGroup();
	   EventLoopGroup workerGroup=new NioEventLoopGroup();
	   
	   try {
		ServerBootstrap bootstrap=new ServerBootstrap();
		   bootstrap.group(bossGroup,workerGroup)
		            .channel(NioServerSocketChannel.class)
		            .childHandler(new ChannelInitializer<SocketChannel>() {

						@Override
						protected void initChannel(SocketChannel socketChannel)
								throws Exception {
							// TODO 自动生成的方法存根
							socketChannel.pipeline().addLast(new ServerHandler());
							
						}
					}).option(ChannelOption.SO_BACKLOG, 128)
					  .option(ChannelOption.SO_SNDBUF, 32*1024)
					  .option(ChannelOption.SO_RCVBUF, 32*1024)
					  .childOption(ChannelOption.SO_KEEPALIVE, true);
		   ChannelFuture future=bootstrap.bind(new InetSocketAddress(port)).sync();
		   future.channel().closeFuture().sync();
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	   finally{
		   workerGroup.shutdownGracefully();
		   bossGroup.shutdownGracefully();
	   }
	   
   }
   
   public static void main(String[] args){
	   new Server(8379).run();
   }
}
