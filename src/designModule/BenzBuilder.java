package designModule;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

	private HummerH1Model1 benz=new HummerH1Model1();
	
	@Override
	public void setSequence(ArrayList<String> sequence) {
		// TODO �Զ����ɵķ������
		this.benz.setSequence(sequence);
	}

	@Override
	public HummerModel getCarModel() {
		// TODO �Զ����ɵķ������
		return this.benz;
	}

}
