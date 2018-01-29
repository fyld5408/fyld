package designModule;

public class prettyGirl implements IGoodBodyGirl,IGreatTemperamentGirl{
    private String nameString;
	
	public prettyGirl(String name){
		this.nameString=name;
	}
	
	@Override
	public void greatTemperament() {
		// TODO 自动生成的方法存根
		System.out.println(this.nameString+"气质好");
	}

	@Override
	public void goodLooking() {
		// TODO 自动生成的方法存根
		System.out.println(this.nameString+"脸蛋好");
	}

	@Override
	public void niceFigure() {
		// TODO 自动生成的方法存根
		System.out.println(this.nameString+"身材好");
	}

}
