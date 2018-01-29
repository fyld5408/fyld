package designModule;

public class SortDecorator extends Decorator{

	public SortDecorator(SchoolReport sr) {
		super(sr);
	}

	private void reportSort(){
		System.out.println("�ɼ�");
	}
	
	public void report(){
		super.report();
		this.reportSort();
	}
}
