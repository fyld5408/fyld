package designModule;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{
     public Son(int _level) {
		super(_level);
		// TODO �Զ����ɵĹ��캯�����
	}

	public Collection doSomething(Map map){
    	 System.out.println("����");
    	 return map.values();
     }
	
}
