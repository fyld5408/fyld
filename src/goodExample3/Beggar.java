package goodExample3;

public class Beggar extends EventCustomer{

	public Beggar() {
		super(EventCustomerType.DEL);
		// TODO 自动生成的构造函数存根
	}

	@Override
	public void exec(ProductEvent event) {
		// TODO 自动生成的方法存根
		Product product=event.getSource();
		ProductEventType type=event.getEventType();
		System.out.println(product.getName()+type);		
	}

}
