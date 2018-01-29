package designModule;

public class ConcreteCommand extends Command{
    
	private Receiver receiver;
	
	public ConcreteCommand(Receiver _receiver){
		this.receiver=_receiver;
	}
	
	@Override
	public void execute() {
		// TODO 自动生成的方法存根
		this.receiver.doSomething();
	}

}
