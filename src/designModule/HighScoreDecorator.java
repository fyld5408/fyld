package designModule;

public class HighScoreDecorator extends Decorator{

	public HighScoreDecorator(SchoolReport sr) {
		super(sr);
	}
	
	private void reportHighScore(){
		System.out.println("�ɼ�");
	}
    
	public void report(){
		this.reportHighScore();
		super.report();
	}
}
