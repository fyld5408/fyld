package ManyThreads;

import java.lang.Thread.UncaughtExceptionHandler;

import designModule.CommandEnum;

public class Run{

	public static void main(String[] args) {
		ThreadA a=new ThreadA();
		ThreadB b=new ThreadB();
		a.start();
		b.start();
	/*	try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		blogin.start();*/
		//System.out.println("main"+testLock.lock.getWaitQueueLength(testLock.condition));
	}

}
