package designModule;

import java.util.Map;

public class OuterUserInfo extends OuterUser implements IUserInfo{
    private Map<String, String> baseInfoMap=super.getUserBaseInfo();
	
	@Override
	public String getUserName() {
		// TODO 自动生成的方法存根
		return this.baseInfoMap.get("name");
	}

	@Override
	public String getHome() {
		// TODO 自动生成的方法存根
		return null;
	}

}
