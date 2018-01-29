package ManyThreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestLock {
   public ReentrantLock lock=new ReentrantLock();
   public Condition condition=lock.newCondition();
   public void countHold(){
	   lock.lock();
	  // System.out.println(lock.getHoldCount());
	 //  System.out.println(lock.getQueueLength());
	//   System.out.println(lock.getHoldCount()+lock.getQueueLength());	  
	   try {
		   condition.await();
		//Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO 自动生成的 catch 块
		e.printStackTrace();
	}
	   lock.unlock();
   }
   
   public void test(){
	 lock.lock();
	   System.out.println("main"+lock.getWaitQueueLength(condition));
     
   }
}
