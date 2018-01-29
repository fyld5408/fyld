package goodExample;

import designModule.Calculator;

public class Invoker {
	//����ģʽ
     public String exec(String _commandStr){
    	 String result="";
    	 CommandVO vo=new CommandVO(_commandStr);
    	 //���裬����ö�ٵ�����������ƥ��vo�������Ƿ����
    	 if(CommandEnum.getNames().contains(vo.getCommandName())){
    		 //ö�ٿ���ͨ��valueof�õ���Ӧ��ĳ��ö�٣�����value����ö����
    		 String className=CommandEnum.valueOf(vo.getCommandName()).getValue();
    		 Command command;
    		 try {
    			 //className��ͨ��ö�ٶ���ķ�������ȡ��ö���е�valueֵ�������ĳ�������࣬ͨ������Ϳ����ɶ�Ӧ��command
				command=(Command)Class.forName(className).newInstance();
			     result=command.execute(vo);
    		 } catch (Exception e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			} 
    		 
    	 }else{
    		 result="�޷�ִ������";
    	 }
    	 return result;
    	 
     }
}
