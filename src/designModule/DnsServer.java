package designModule;

import java.util.Observable;
import java.util.Observer;

public class DnsServer extends Observable implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO �Զ����ɵķ������
		
	}
	
	public void test(Director t){
		super.notifyObservers(t);
	}

}
