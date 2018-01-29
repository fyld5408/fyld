package designModule;

import java.lang.reflect.Constructor;

public class SingletonFactory {
    private static SingleTonInterface singleton;
    public <T extends SingleTonInterface> void buildSingleton(Class<T> cl){
    	try{
    		Constructor constructor=cl.getDeclaredConstructor();
    		constructor.setAccessible(true);
    		singleton=(SingleTonInterface)constructor.newInstance();
    	}catch(Exception e){
    		//
    	}
    }
    public static SingleTonInterface getSingleton(){
    	return singleton;
    }
}
