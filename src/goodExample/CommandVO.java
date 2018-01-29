package goodExample;

import java.util.ArrayList;
import java.util.HashSet;

public class CommandVO {
	//体会此处final和static的精髓
    public final static String DIVIDE_FLAG=" ";
    public final static String PREFIX="-";
    private String commandName="";
    private ArrayList<String> paramList=new ArrayList<String>();
    private ArrayList<String> dataList=new ArrayList<String>();
    public CommandVO(String commandStr){
    	if(commandStr!=null&&commandStr.length()!=0){
    		String[] complexStr=commandStr.split(CommandVO.DIVIDE_FLAG);
    		this.commandName=complexStr[0];
    		for(int i=1;i<complexStr.length;i++){
    			String str=complexStr[i];
    			//判断str是不是以-开头，indexof表示以param为子串开始的位置
    			if(str.indexOf(CommandVO.PREFIX)==0){
    				this.paramList.add(str.replace(CommandVO.PREFIX, "").trim());
    			}else{
    				this.dataList.add(str.trim());
    			}
    		}
    	}else{
    		System.out.println("命令解析失败，必须传递一个命令才能执行");
    	}
    }
    
    public String getCommandName(){
    	return this.commandName;
    }
    
    public ArrayList<String> getParam(){
    	//2个精髓，1个是如果paramList为空，new HashSet会报错
    	//2是通过hashset，再转arrayList可以达到去重复的目的
    	if(this.paramList.size()==0){
    		this.paramList.add("");
    	}
    	return new ArrayList(new HashSet(this.paramList));
    }
    
    public ArrayList<String> getData(){
    	return this.dataList;
    }
}
