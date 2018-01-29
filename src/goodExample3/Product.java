package goodExample3;

public class Product implements Cloneable{
    private static String name;
    
    private boolean canChanged=false;
    
    public static Product createProduct(ProductManager manager,String _name){
    	Product product=null;
    	if(manager.isCreateProduct()){
    		product=new Product(_name);
    	}
    	return product;
    }
    
    private Product(String _name){
    	name=_name;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	@Override
    public Product clone(){
    	Product product=null;
    	try {
			product=(Product)super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
    	return product;
    }
}
