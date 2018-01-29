package socket;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
    public static void main(String[] args) throws UnknownHostException, IOException{
    	System.out.println("client start");
    	Socket socket=new Socket(InetAddress.getByName("localhost"),10005);
    	BufferedReader brfu=new BufferedReader(new FileReader("D:\\client.txt"));
    	PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
    	String lineString=null;
    	try {
			while((lineString=brfu.readLine())!=null){
				out.println(lineString);
			}
			socket.shutdownOutput();
			BufferedReader brln=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("server data :"+brln.readLine());
			brln.close();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	socket.close();
    }
}
