package goodExample3;

public class Beggar extends EventCustomer{

	public Beggar() {
		super(EventCustomerType.DEL);
		// TODO �Զ����ɵĹ��캯�����
	}

	@Override
	public void exec(ProductEvent event) {
		// TODO �Զ����ɵķ������
		Product product=event.getSource();
		ProductEventType type=event.getEventType();
		System.out.println(product.getName()+type);		
	}

}
