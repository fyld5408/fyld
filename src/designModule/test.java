package designModule;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class test {
         UserInfo userInfo=new UserInfoImp(); 
         UserBiz userBiz=(UserBiz) userInfo;
         public static void main(String[] args) throws Exception{
                AbsActor actor=new OldActor();
                Role role=new KungFuRole();
                actor.act(role);
                actor.act(new KungFuRole());
         }
         
}
