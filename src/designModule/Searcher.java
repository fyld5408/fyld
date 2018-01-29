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
		System.out.println("长相美女");
		super.goodBodyGirl.goodLooking();
		super.goodBodyGirl.niceFigure();
		System.out.println("气质美女");
		super.greatTemperamentGirl.greatTemperament();		
	}

}
