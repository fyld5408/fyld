package designModule;

public class SetterDriver implements IDriver2{
    private ICar car;
    
    public void setCar(ICar car){
    	this.car=car;
    }
	
	@Override
	public void drive() {
		// TODO 自动生成的方法存根
		this.car.run();
	}

}
