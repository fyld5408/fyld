package goodExample;

public abstract class CommandName {
      private CommandName nextOperator;
      
      //�˴�final��ʹ��
      public final String handleMessage(CommandVO vo){
    	  String result="";
    	  if(vo.getParam().size()==0||vo.getParam()
    			  .contains(this.getOperateParam())){
    		  result=this.echo(vo);
    	  }else{
    		  if(this.nextOperator!=null){
    			  result=this.nextOperator.handleMessage(vo);
    		  }
    	  }
    	  return result;
      }
      
      public void setNext(CommandName _operator){
    	  this.nextOperator=_operator;
      }
      
      //�˴�protected��ʹ��
      protected abstract String getOperateParam();
      
      protected abstract String echo(CommandVO vo);
}
