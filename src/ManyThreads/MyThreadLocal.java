package ManyThreads;

public class MyThreadLocal extends ThreadLocal{
    @Override
    protected Object initialValue(){
    	return "dsads";
    }
}
