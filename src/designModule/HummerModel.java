package designModule;

import java.util.ArrayList;

public abstract class HummerModel {
	private ArrayList<String> sequence=new ArrayList<String>();
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    protected abstract boolean isAlarm();
    public void run(){
    	for(int i=0;i<this.sequence.size();i++){
    		String actionNameString=this.sequence.get(i);
    		if(actionNameString.equalsIgnoreCase("start")){
    			this.start();
    		}
    		else if(actionNameString.equalsIgnoreCase("stop")){
    			this.stop();
    		}
    		else if(actionNameString.equalsIgnoreCase("alarm")){
    			this.alarm();
    		}
    		else if(actionNameString.equalsIgnoreCase("engineBoom")){
    			this.engineBoom();
    		}
    	}
    }
    
    final public void setSequence(ArrayList<String> sequence){
    	this.sequence=sequence;
    }
}
