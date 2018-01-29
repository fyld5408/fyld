package goodExample;

import java.util.ArrayList;
import java.util.HashSet;

public class CommandVO {
	//���˴�final��static�ľ���
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
    			//�ж�str�ǲ�����-��ͷ��indexof��ʾ��paramΪ�Ӵ���ʼ��λ��
    			if(str.indexOf(CommandVO.PREFIX)==0){
    				this.paramList.add(str.replace(CommandVO.PREFIX, "").trim());
    			}else{
    				this.dataList.add(str.trim());
    			}
    		}
    	}else{
    		System.out.println("�������ʧ�ܣ����봫��һ���������ִ��");
    	}
    }
    
    public String getCommandName(){
    	return this.commandName;
    }
    
    public ArrayList<String> getParam(){
    	//2�����裬1�������paramListΪ�գ�new HashSet�ᱨ��
    	//2��ͨ��hashset����תarrayList���Դﵽȥ�ظ���Ŀ��
    	if(this.paramList.size()==0){
    		this.paramList.add("");
    	}
    	return new ArrayList(new HashSet(this.paramList));
    }
    
    public ArrayList<String> getData(){
    	return this.dataList;
    }
}
