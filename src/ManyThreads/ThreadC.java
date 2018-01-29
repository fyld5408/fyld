package ManyThreads;

public class ThreadC extends Thread{
    private Object lock;
    public ThreadC(Object lock){
   	 super();
   	 this.lock=lock;
    }
    public void run(){
   	 ServiceTest service=new ServiceTest();
   	 service.synNotifyMethod(lock);
    }
}
