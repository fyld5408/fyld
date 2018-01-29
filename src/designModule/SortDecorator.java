package designModule;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportSort(){
		System.out.println("³É¼¨");
	}
	
	public void report(){
		super.report();
		this.reportSort();
	}
}
