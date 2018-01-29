package designModule;

public class NovelBook implements IBook {
      private String nameString;
   
      private int price;
      
      private String author;
  	 
  	public NovelBook(String nameString,int price,String author){
  		this.nameString=nameString;
  		this.price=price;
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
      
    
}
