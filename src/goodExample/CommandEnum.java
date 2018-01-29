package goodExample;

import java.util.ArrayList;

//���裬ö�ٵ�ʹ��
public enum CommandEnum {
	ls("LSCommand"),ls_a("LS_ACommand");
    private String valueString = "";
    private CommandEnum(String value){
    	this.valueString=value;
    }
    public String getValue(){
    	return this.valueString;
    }
    
    //���裬Ϊenum�ṩһ����������ö�ٵķ���
    public static ArrayList<String> getNames(){
    	//ע��˴���ͨ��enum.values���ܵõ����е�ö��
    	CommandEnum[] commandEnums=CommandEnum.values();
    	ArrayList<String> names=new ArrayList<String>();
    	for(CommandEnum c:commandEnums){
    		names.add(c.name());
    	}
    	return names;
    }
}
