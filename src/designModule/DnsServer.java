package designModule;

import java.util.Observable;
import java.util.Observer;

public class DnsServer extends Observable implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		// TODO 自动生成的方法存根
		
	}
	
	public void test(Director t){
		super.notifyObservers(t);
	}

}
