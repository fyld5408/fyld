package ManyThreads;

public class DealThread implements Runnable{
	
	public String usernameString;
	
	public Object lock1=new Object();
	
	public Object lock2=new Object();
	
	public void setFlag(String username){
		this.usernameString=username;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		if(usernameString.equals("a")){
			synchronized (lock1) {
				try {
					System.out.println("username="+usernameString);
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (lock2) {
					System.out.println("lock1-lock2");
				}
			}
		}
		if(usernameString.equals("b")){
			synchronized (lock2) {
				try {
					System.out.println("username="+usernameString);
					Thread.sleep(3000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				synchronized (lock1) {
					System.out.println("lock2-lock1");
				}
			}
		}
		
	}

}
