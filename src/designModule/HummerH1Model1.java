package designModule;

public class HummerH1Model1 extends HummerModel{
    private boolean isAlarm=true;
	
	@Override
	protected void start() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void stop() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void alarm() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected void engineBoom() {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	protected boolean isAlarm() {
		// TODO �Զ����ɵķ������
		return this.isAlarm;
	}
	
	public void setAlarm(boolean isAlarm){
		this.isAlarm=isAlarm;
	}

}
