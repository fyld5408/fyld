package designModule;

import java.util.HashMap;
import java.util.Map;

public class OuterUser implements IOuterUser{

	public <T> Map<String,T> getUserBaseInfo() {
		// TODO �Զ����ɵķ������
		HashMap<String,T> base=new HashMap<String,T>();
		base.put("userName", (T)"1");
		return base;
	}

}
