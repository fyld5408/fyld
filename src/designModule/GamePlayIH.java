package designModule;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayIH implements InvocationHandler{
   Class cls=null;
   Object object=null;
	public GamePlayIH(Object obj){
		this.object=obj;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO �Զ����ɵķ������
		Object resultObject=method.invoke(this.object, args);
		return resultObject;
	}

}
