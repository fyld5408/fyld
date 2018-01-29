package designModule;

public class HighScoreDecorator extends Decorator{

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore(){
		System.out.println("³É¼¨");
	}
    
	public void report(){
		this.reportHighScore();
		super.report();
	}
}
