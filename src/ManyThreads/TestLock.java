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
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
	   lock.unlock();
   }
   
   public void test(){
	 lock.lock();
	   System.out.println("main"+lock.getWaitQueueLength(condition));
     
   }
}
