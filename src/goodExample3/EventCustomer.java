package goodExample3;

import java.util.Vector;

public abstract class EventCustomer {
     private Vector<EventCustomerType> customerType=
    		 new Vector<EventCustomerType>();
     
     public EventCustomer(EventCustomerType _type){
    	 addCustomType(_type);
     }
     
     public void addCustomType(EventCustomerType _type){
    	 customerType.add(_type);
     }
     
     public Vector<EventCustomerType> getCustomerType(){
    	 return customerType;
     }
     
     public abstract void exec(ProductEvent event);
}
