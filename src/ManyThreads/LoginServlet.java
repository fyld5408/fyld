package ManyThreads;

public class LoginServlet {
   private String userNameRef;
   private  String passwordRef;
   public  void doPost(String userName,String password){
	   try {
		userNameRef=userName;
		passwordRef=password;
		   if("a".equals(userName)){
			   Thread.sleep(2000);
		   }
		   
		   System.out.println(userNameRef+" "+passwordRef );
	} catch (InterruptedException e) {
		// TODO �Զ����ɵ� catch ��
		e.printStackTrace();
	}
   }
}
