package designModule;

public class Women implements IWomen{

	private int type=0;
	
	private String request="";
	
	public Women(int _type,String _request){
		this.type=_type;
		this.request=_request;
	}
	
	public int getType() {
		// TODO �Զ����ɵķ������
		return this.type;
	}

	public String getRequest() {
		// TODO �Զ����ɵķ������
		return this.request;
	}

}
