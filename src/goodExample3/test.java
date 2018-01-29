package goodExample3;

public class test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		ProductManager productManager=new ProductManager();  
           EventDispatch dispatch=EventDispatch.getEventDispatch();
           dispatch.registerCustomer(new Beggar());
           dispatch.registerCustomer(new Commoner());
           Product product=productManager.createProduct("asd");
           productManager.editProduct(product, "aaa");
           productManager.abandonProduct(product);
	}

}
