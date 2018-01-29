package ManyThreads;

public class ServiceTest {
   public void testMethod(Object lock){
	   try {
		synchronized (lock) {
			System.out.println("testMethod begin");
			lock.wait();
			System.out.println("testMethod end");
			
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
   }
   
   public void synNotifyMethod(Object lock){
	   try {
		  synchronized(lock){
			  System.out.println("synNotifyMethod begin");
			  lock.notify();
			  Thread.sleep(1000);
			  System.out.println("synNotifyMethod end");
		  }
	} catch (Exception e) {
		// TODO: handle exception
	}
   }
}
