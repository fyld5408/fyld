package designModule;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

	private HummerH1Model1 benz=new HummerH1Model1();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO 自动生成的方法存根
		this.benz.setSequence(sequence);
	}

	@Override
	public HummerModel getCarModel() {
		// TODO 自动生成的方法存根
		return this.benz;
	}

}
