package designModule;

public class WhiteMan implements Human{

	@Override
	public void getColor() {
		System.out.println("白人皮肤");
	}

	@Override
	public void talk() {
		System.out.println("白人说话");
	}
	
}