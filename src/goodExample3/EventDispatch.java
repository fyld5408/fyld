package goodExample3;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

public class EventDispatch implements Observer{
    //���裬����ģʽ��ʵ��,ע��privateʹ�ú�������ֻ��ͨ�����з���getEventDispatch()��ȡ
	private final static EventDispatch dispatch=new EventDispatch();
    
	private Vector<EventCustomer> customers=new Vector<EventCustomer>();
    private EventDispatch(){
    	
    }
	
    public static EventDispatch getEventDispatch(){
    	return dispatch;
    }
    
	public void update(Observable o,Object arg){
		Product product=(Product)arg;
		ProductEvent event=(ProductEvent)o;
		for(EventCustomer e:customers){
			for(EventCustomerType t:e.getCustomerType()){
				if(t.getValue()==event.getEventType().getValue()){
					e.exec(event);
				}
			}
		}
	}
	
	public void registerCustomer(EventCustomer _customer){
		customers.add(_customer);
	}
}
