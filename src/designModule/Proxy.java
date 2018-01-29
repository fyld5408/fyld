package designModule;

public class Proxy implements Subject{
    private Subject subject=null;
    public Proxy(Subject subject){
    	this.subject=subject;
    }
    
    public Proxy(String name){
    	try {
		          subject=new RealSubject(this, name);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
	@Override
	public void request() {
		// TODO 自动生成的方法存根
			this.before();
			this.subject.request();
			this.after();
	}
	
	public void before(){
		
	}

	public void after(){
		
	}

	@Override
	public Subject getProxy() {
		// TODO 自动生成的方法存根
		return this;
	}
	
	
}
