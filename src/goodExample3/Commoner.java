package goodExample3;

public class Commoner extends EventCustomer{

	public Commoner() {
		super(EventCustomerType.NEW);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void exec(ProductEvent event) {
		Product product=event.getSource();
		ProductEventType type=event.getEventType();
		System.out.println(product.getName()+type);
	}

}
