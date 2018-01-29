package goodExample3;

public class Commoner extends EventCustomer{

	public Commoner() {
		super(EventCustomerType.NEW);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void exec(ProductEvent event) {
		Product product=event.getSource();
		ProductEventType type=event.getEventType();
		System.out.println(product.getName()+type);
	}

}
