package designModule;

public class HummerH1Model1 extends HummerModel{
    private boolean isAlarm=true;
	
	@Override
	protected void start() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void stop() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void alarm() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected void engineBoom() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	protected boolean isAlarm() {
		// TODO 自动生成的方法存根
		return this.isAlarm;
	}
	
	public void setAlarm(boolean isAlarm){
		this.isAlarm=isAlarm;
	}

}
