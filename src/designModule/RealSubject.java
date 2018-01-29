package designModule;

public class RealSubject implements Subject{
    private String nameString="";
    private Subject proxy=null;
    public RealSubject(String nameString){
    	this.nameString=nameString;
    }
	public RealSubject(Subject proxy,String name) throws Exception{
		if(proxy==null){
			throw new Exception("不能创建真实角色");
		}
		else{
			this.nameString=name;
		}
	}
	@Override
	public void request() {
		// TODO 自动生成的方法存根
		if(this.isProxy())
		System.out.println("a");
		else {
			System.out.println("请找代理");
		}
	}
	@Override
	public Subject getProxy() {
		// TODO 自动生成的方法存根
		this.proxy=new Proxy(this);
		return this.proxy;
	}
	
	private boolean isProxy(){
		if(this.proxy==null)
			return false;
		else 
			return true;
	}

}
