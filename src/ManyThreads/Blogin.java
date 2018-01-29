package ManyThreads;

public class Blogin extends Thread{
	private Service loginServlet;
	public Blogin(Service loginServlet) {
		this.loginServlet=loginServlet;
	}
	public void run(){
		
    	loginServlet.signal();
    }
}
