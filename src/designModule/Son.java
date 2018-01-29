package designModule;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{
     public Son(int _level) {
		super(_level);
		// TODO 自动生成的构造函数存根
	}

	public Collection doSomething(Map map){
    	 System.out.println("子类");
    	 return map.values();
     }
	
}
