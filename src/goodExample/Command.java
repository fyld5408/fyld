package goodExample;

import java.awt.List;
import java.util.ArrayList;

public abstract class Command {
    public abstract String execute(CommandVO vo);
    
    //���裬�÷���������һ��������
    protected final ArrayList<? extends CommandName> buildChain(
    		Class<? extends CommandName> abstractClass){
    	ArrayList<Class> classes=new ArrayList<Class>();
    	//���ˣ�ͨ��abstractClass���õ�ls��ls_a��ȽϺ���
    	classes.add(LS.class);
    	classes.add(LS_A.class);
    	ArrayList<CommandName> commandNameList=new ArrayList<CommandName>();
    	for(Class c:classes){
    		CommandName commandName=null;
    		try {
    			//���裬�÷���ʱ��Ҫcatch�쳣,�÷���������һ����,ÿһ��commandName����һ�����Դ������
				commandName=(CommandName)Class.forName(c.getName()).newInstance();
			} catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
    		if(commandNameList.size()>0){
    			//���裬���ǰһ��commandName��Ϊ�գ���������뵽ǰһ�����¸���ȥ
    			commandNameList.get(commandNameList.size()-1).setNext(commandName);
    		}
    		commandNameList.add(commandName);
    	}
    	return commandNameList;
    }
    
}
