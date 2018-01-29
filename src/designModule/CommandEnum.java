package designModule;

public enum CommandEnum {
	ls("te");
	private String value="";
     private CommandEnum(String value){
    	 this.value=value;
     }
     public String getValue(){
    	 return this.value;
     }
}
