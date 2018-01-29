package designModule;

public class ConcreteCommand extends Command{
    
	private Receiver receiver;
	
	public ConcreteCommand(Receiver _receiver){
		this.receiver=_receiver;
	}
	
	@Override
	public void execute() {
		// TODO �Զ����ɵķ������
		this.receiver.doSomething();
	}

}
