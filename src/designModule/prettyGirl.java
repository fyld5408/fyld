package designModule;

public class prettyGirl implements IGoodBodyGirl,IGreatTemperamentGirl{
    private String nameString;
	
	public prettyGirl(String name){
		this.nameString=name;
	}
	
	@Override
	public void greatTemperament() {
		// TODO �Զ����ɵķ������
		System.out.println(this.nameString+"���ʺ�");
	}

	@Override
	public void goodLooking() {
		// TODO �Զ����ɵķ������
		System.out.println(this.nameString+"������");
	}

	@Override
	public void niceFigure() {
		// TODO �Զ����ɵķ������
		System.out.println(this.nameString+"��ĺ�");
	}

}
