package designModule;

public class RealSubject implements Subject{
    private String nameString="";
    private Subject proxy=null;
    public RealSubject(String nameString){
    	this.nameString=nameString;
    }
	public RealSubject(Subject proxy,String name) throws Exception{
		if(proxy==null){
			throw new Exception("���ܴ�����ʵ��ɫ");
		}
		else{
			this.nameString=name;
		}
	}
	@Override
	public void request() {
		// TODO �Զ����ɵķ������
		if(this.isProxy())
		System.out.println("a");
		else {
			System.out.println("���Ҵ���");
		}
	}
	@Override
	public Subject getProxy() {
		// TODO �Զ����ɵķ������
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
