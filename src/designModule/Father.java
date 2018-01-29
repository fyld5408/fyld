package designModule;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Father extends Handler{

	public Father(int _level) {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println(women.getRequest());
		
	}
	
	
     
}
