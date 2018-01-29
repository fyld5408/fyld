package designModule;


public class ClassDriver implements IDriver2{
    private ICar car;
    
    public ClassDriver(ICar car){
    	this.car=car;
    }
	
	@Override
	public void drive() {
		// TODO 自动生成的方法存根
		this.car.run();
	}

}
