package goodExample3;

import java.util.Observable;

public class ProductEvent extends Observable{
     private Product source;
     
     private ProductEventType type;
     
     public ProductEvent(Product p){
    	 this(p,ProductEventType.NEW_PRODUCT);
     }
     
     public ProductEvent(Product p,ProductEventType type){
    	 this.source=p;
    	 this.type=type;
    	 notifyEventDispatch();
     }
     
     public Product getSource(){
    	 return source;
     }
     
     public ProductEventType getEventType(){
    	 return type;
     }
     
     private void notifyEventDispatch(){
    	 super.addObserver(EventDispatch.getEventDispatch());
    	 super.setChanged();
    	 super.notifyObservers(source);
     }
}
