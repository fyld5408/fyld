package socket;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServersSocket {

	/**
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO 自动生成的方法存根
     System.out.println("server start");
     ServerSocket ss=new ServerSocket(10005);
     Socket socket=ss.accept();
     String ip=socket.getInetAddress().getHostAddress();
     String name=socket.getInetAddress().getHostName();
     System.out.println("accept is from "+name+" and ip is "+ip);
     BufferedReader brfu=new BufferedReader(new InputStreamReader(socket.getInputStream()));
     PrintWriter out = new PrintWriter(new FileWriter("D:\\server.txt"),true);
     String line=null;
    // Thread.sleep(2000);
     
     try {
		while((line=brfu.readLine())!=null){
			 out.write(line+"\r\n");
			 System.out.println(line);
		 }
		 PrintWriter outPrintWriter=new PrintWriter(socket.getOutputStream(),true);
		 outPrintWriter.println("accept and save");
		 out.close();
		 socket.close();
		 ss.close();
	} catch (Exception e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	}

}
