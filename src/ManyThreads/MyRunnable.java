package ManyThreads;

public class MyRunnable implements Runnable{

	@Override
	synchronized public  void run() {
		// TODO �Զ����ɵķ������
		System.out.println("running"+Thread.currentThread().getName());
	}

}
