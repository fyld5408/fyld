package goodExample;

import designModule.Calculator;

public class Invoker {
	//命令模式
     public String exec(String _commandStr){
    	 String result="";
    	 CommandVO vo=new CommandVO(_commandStr);
    	 //精髓，利用枚举的所有名字来匹配vo的名字是否存在
    	 if(CommandEnum.getNames().contains(vo.getCommandName())){
    		 //枚举可以通过valueof得到对应的某个枚举，其中value就是枚举名
    		 String className=CommandEnum.valueOf(vo.getCommandName()).getValue();
    		 Command command;
    		 try {
    			 //className是通过枚举定义的方法来获取的枚举中的value值，因而是某个具体类，通过反射就可生成对应的command
				command=(Command)Class.forName(className).newInstance();
			     result=command.execute(vo);
    		 } catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			} 
    		 
    	 }else{
    		 result="无法执行命令";
    	 }
    	 return result;
    	 
     }
}
