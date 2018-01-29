package goodExample;

import java.awt.List;
import java.util.ArrayList;

public abstract class Command {
    public abstract String execute(CommandVO vo);
    
    //精髓，用反射来构建一个处理链
    protected final ArrayList<? extends CommandName> buildChain(
    		Class<? extends CommandName> abstractClass){
    	ArrayList<Class> classes=new ArrayList<Class>();
    	//简化了，通过abstractClass来得到ls、ls_a类比较合适
    	classes.add(LS.class);
    	classes.add(LS_A.class);
    	ArrayList<CommandName> commandNameList=new ArrayList<CommandName>();
    	for(Class c:classes){
    		CommandName commandName=null;
    		try {
    			//精髓，用反射时需要catch异常,用反射来构建一个类,每一个commandName都是一个可以处理的类
				commandName=(CommandName)Class.forName(c.getName()).newInstance();
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
    		if(commandNameList.size()>0){
    			//精髓，如果前一个commandName不为空，将这个塞入到前一个的下个中去
    			commandNameList.get(commandNameList.size()-1).setNext(commandName);
    		}
    		commandNameList.add(commandName);
    	}
    	return commandNameList;
    }
    
}
