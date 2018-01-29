package ManyThreads;

public class ThreadB extends Thread{
    
    public void run(){
   	   try {
   		for(int i=0;i<20;i++){
			if(ThreadLocalTools.data.get()==null){
				ThreadLocalTools.data.set(2);
			}
		}
   		System.out.println("B线程值为"+ThreadLocalTools.data.get());
	} catch (Exception e) {
		// TODO: handle exception
	}
    }
}
