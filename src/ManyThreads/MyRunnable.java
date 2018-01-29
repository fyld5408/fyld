package ManyThreads;

public class MyRunnable implements Runnable{

	@Override
	synchronized public  void run() {
		// TODO 自动生成的方法存根
		System.out.println("running"+Thread.currentThread().getName());
	}

}
