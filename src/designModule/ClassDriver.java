package designModule;


public class ClassDriver implements IDriver2{
    private ICar car;
    
    public ClassDriver(ICar car){
    	this.car=car;
    }
	
	@Override
	public void drive() {
		// TODO �Զ����ɵķ������
		this.car.run();
	}

}
