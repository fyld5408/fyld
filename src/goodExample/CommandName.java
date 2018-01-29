package goodExample;

public abstract class CommandName {
      private CommandName nextOperator;
      
      //此处final的使用
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
      
      //此处protected的使用
      protected abstract String getOperateParam();
      
      protected abstract String echo(CommandVO vo);
}
