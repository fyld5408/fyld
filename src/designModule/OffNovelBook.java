package designModule;

public class OffNovelBook extends NovelBook{

	public OffNovelBook(String nameString, int price, String author) {
		super(nameString, price, author);
		// TODO �Զ����ɵĹ��캯�����
	}
    
	@Override
	public int getPrice(){
		if(super.getPrice()>4000)
			return super.getPrice()*90/100;
		else {
			return super.getPrice()*80/100;
		}
	}
	
}
