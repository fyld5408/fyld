package designModule;

public class Searcher extends AbstractSearcher{

	public Searcher(IGoodBodyGirl goodBodyGirl) {
		super(goodBodyGirl);
	}
    
	public Searcher(IGreatTemperamentGirl greatTemperamentGirl){
		super(greatTemperamentGirl);
	}
	
	public Searcher(IGoodBodyGirl goodBodyGirl,IGreatTemperamentGirl greatTemperamentGirl){
		super(goodBodyGirl,greatTemperamentGirl);
	   }
	
	@Override
	public void show() {
		System.out.println("������Ů");
		super.goodBodyGirl.goodLooking();
		super.goodBodyGirl.niceFigure();
		System.out.println("������Ů");
		super.greatTemperamentGirl.greatTemperament();		
	}

}
