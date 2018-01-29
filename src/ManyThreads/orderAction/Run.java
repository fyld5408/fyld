package ManyThreads.orderAction;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import ManyThreads.ThreadA;

public class Run {
     volatile private static int nextPrintWho=1;
     private static ReentrantLock lock=new ReentrantLock();
     final private static Condition conditionA=lock.newCondition();
     final private static Condition conditionB=lock.newCondition();
     final private static Condition conditionC=lock.newCondition();
     public static void main(String[] args){
    	 Thread threadA=new Thread(){
    		 public void run(){
    			 try {
					lock.lock();
					while(nextPrintWho!=1){
						conditionA.await();
					}
					for(int i=0;i<3;i++){
						System.out.println("threadA   "+(i+1));
					}
					nextPrintWho=2;
					conditionB.signalAll();
				} catch (Exception e) {
				    e.printStackTrace();
					// TODO: handle exception
				}finally{
					lock.unlock();
				}
    		 }
    	 };
    	 Thread threadB=new Thread(){
    		 public void run(){
    			 try {
					lock.lock();
					while(nextPrintWho!=2){
						conditionB.await();
					}
					for(int i=0;i<3;i++){
						System.out.println("threadB   "+(i+1));
					}
					nextPrintWho=3;
					conditionC.signalAll();
				} catch (Exception e) {
				    e.printStackTrace();
					// TODO: handle exception
				}finally{
					lock.unlock();
				}
    		 }
    	 };
    	 Thread threadC=new Thread(){
    		 public void run(){
    			 try {
					lock.lock();
					while(nextPrintWho!=3){
						conditionC.await();
					}
					for(int i=0;i<3;i++){
						System.out.println("threadC  "+(i+1));
					}
					nextPrintWho=1;
					conditionA.signalAll();
				} catch (Exception e) {
				    e.printStackTrace();
					// TODO: handle exception
				}finally{
					lock.unlock();
				}
    		 }
    	 };
    	 
    	 Thread[] aThreads=new Thread[5];
    	 Thread[] bThreads=new Thread[5];
    	 Thread[] cThreads=new Thread[5];
    	 for(int i=0;i<5;i++){
    		 aThreads[i]=new Thread(threadA);
    		 bThreads[i]=new Thread(threadB);
    		 cThreads[i]=new Thread(threadC);
    		 aThreads[i].start();
    		 bThreads[i].start();
    		 cThreads[i].start();
    	 }
     }
}
