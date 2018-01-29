package ManyThreads;

public class Alogin extends Thread{
	private String loginServlet;
	public Alogin(String loginServlet) {
		this.loginServlet=loginServlet;
	}
     public  void run(){
    	 int i=Integer.parseInt(loginServlet);
    	// loginServlet.await();
     }
}
