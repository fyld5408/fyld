package designModule;

public class Singleton {
	 private static Singleton singleton=new Singleton();
     //¶öººÄ£Ê½
     private Singleton(){
    	 
     }
     
     public Singleton newInstance(){
    	 return singleton;
     }
     
}
