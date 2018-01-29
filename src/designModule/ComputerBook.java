package designModule;

public class ComputerBook implements IComputerBook{
    private String nameString;
    private int price;
    private String scopeString;
    private String author;
    
    public ComputerBook(String name,int price,String scope,String author){
    	this.nameString=name;
    	this.price=price;
    	this.scopeString=scope;
    	this.author=author;
    }
    
	@Override
	public String getName() {
		// TODO 自动生成的方法存根
		return this.nameString;
	}

	@Override
	public int getPrice() {
		// TODO 自动生成的方法存根
		return this.price;
	}

	@Override
	public String getAuthor() {
		// TODO 自动生成的方法存根
		return this.author;
	}

	@Override
	public String getScope() {
		// TODO 自动生成的方法存根
		return this.scopeString;
	}

}
