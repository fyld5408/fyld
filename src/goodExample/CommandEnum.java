package goodExample;

import java.util.ArrayList;

//精髓，枚举的使用
public enum CommandEnum {
	ls("LSCommand"),ls_a("LS_ACommand");
    private String valueString = "";
    private CommandEnum(String value){
    	this.valueString=value;
    }
    public String getValue(){
    	return this.valueString;
    }
    
    //精髓，为enum提供一个返回所有枚举的方法
    public static ArrayList<String> getNames(){
    	//注意此处，通过enum.values就能得到所有的枚举
    	CommandEnum[] commandEnums=CommandEnum.values();
    	ArrayList<String> names=new ArrayList<String>();
    	for(CommandEnum c:commandEnums){
    		names.add(c.name());
    	}
    	return names;
    }
}
