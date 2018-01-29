package goodExample3;

public class ProductManager {
	private boolean isPermittedCreate=false;

	//精髓，使得Product只能通过ProductManager才能生成
	public Product createProduct(String name){
		isPermittedCreate=true;
		Product product=Product.createProduct(this, name);
		//创建product后就要触发product事件，调用构造方法，而这个event属于被观察
		//者，因而会通知观察者进行相应响应
		new ProductEvent(product, ProductEventType.NEW_PRODUCT);
		return product;
	}
	
	public void abandonProduct(Product p){
		new ProductEvent(p,ProductEventType.DEL_PRODUCT);
		p=null;
	}
	
	public void editProduct(Product p,String name){
		new ProductEvent(p,ProductEventType.EDIT_PRODUCT);
		p.setName(name);
	}
	
	public boolean isCreateProduct(){
		return isPermittedCreate;
	}
	
	public Product clone(Product p){
		new ProductEvent(p,ProductEventType.CLONE_PRODUCT);
		return p.clone();
	}
}
