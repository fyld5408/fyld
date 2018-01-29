package designModule;

import java.util.ArrayList;
import java.util.Random;

public class Emperor {
      private static int maxNumOfEmperor = 2;
      private static ArrayList<String> nameList=new ArrayList<String>();
      private static ArrayList<Emperor> emperorList=new ArrayList<Emperor>();
      private static int id=0;
      static{
    	  for(int i=0;i<maxNumOfEmperor;i++){
    		  emperorList.add(new Emperor("�ʵ�"+i));
    	  }
      }
      
      private Emperor(){
    	  
      }
      
      private Emperor(String name){
    	  nameList.add(name);
      }
      
      public static Emperor getInstance(){
    	  Random random = new Random();
    	  id=random.nextInt(maxNumOfEmperor);
    	  return emperorList.get(id);
      }
      
      public void say(){
    	  System.out.println(nameList.get(id));
      }
}