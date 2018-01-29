package netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class ServerHandler extends ChannelHandlerAdapter{

   public void channelRead(ChannelHandlerContext ctx,Object msg)
   throws Exception{
	   /*ByteBuf buf=(ByteBuf)msg;
	   byte[] data=new byte[buf.readableBytes()];
	   buf.readBytes(data);
	   String request=new String(data,"utf-8");*/
	   System.out.println("Server:");
	   String response="���Ƿ���";
	   ctx.writeAndFlush(Unpooled.copiedBuffer("888".getBytes()));
   }
   
   @Override  
   public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {  
       cause.printStackTrace();  
       ctx.close();  
   }  
   
}
