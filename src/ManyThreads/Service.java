package ManyThreads;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service {
    private Lock lock=new ReentrantLock();
    private ReentrantReadWriteLock readLock=new ReentrantReadWriteLock();
    private int i=0;
    private Condition condition=lock.newCondition();
    public void testMethod(){
    	lock.lock();
    	readLock.readLock().lock();
    	for(int i=0;i<10;i++){
    		System.out.println(Thread.currentThread().getName()+" "+(i+1));
    	}
     	lock.unlock();
    }
    
    public void testMethod2(){
    	lock.lock();
    	for(int i=0;i<10;i++){
    		System.out.println(Thread.currentThread().getName()+" "+(i+1));
    	}
    	lock.unlock();
    }
    
    public void await(){
    	try {
    	//	lock.unlock();
    		lock.lock();
    		System.out.println("A");
    		Calendar calendar=Calendar.getInstance();
    		calendar.add(Calendar.SECOND, 3);
    	//	else
			condition.awaitUntil(calendar.getTime());
			System.out.println(++i);
			System.out.println("B");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
    }
    
    public void signal(){
    	lock.lock();
    	System.out.println("C");
    	condition.signalAll();
    	lock.unlock();
    }
}
