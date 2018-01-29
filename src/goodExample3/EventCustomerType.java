package goodExample3;

public enum EventCustomerType {
	NEW(1),DEL(2),EDIT(3),CLONE(4);
	private int value=0;
	private EventCustomerType(int _value){
		this.value=_value;
	}
	
	public int getValue(){
		return value;
	}

}
