package designModule;

public class Singleton {
	 private static Singleton singleton=new Singleton();
     //����ģʽ
     private Singleton(){
    	 
     }
     
     public Singleton newInstance(){
    	 return singleton;
     }
     
}
