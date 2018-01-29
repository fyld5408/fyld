package designModule;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo{
    private Map<String, String> baseInfoMap=super.getUserBaseInfo();
	
	@Override
	public String getUserName() {
		// TODO �Զ����ɵķ������
		return this.baseInfoMap.get("name");
	}

	@Override
	public String getHome() {
		// TODO �Զ����ɵķ������
		return null;
	}

}
