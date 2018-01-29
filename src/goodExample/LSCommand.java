package goodExample;

public class LSCommand extends Command{

	@Override
	public String execute(CommandVO vo) {
		//精髓，通过AbstractLs构建一个处理链，获取第一个处理者
		CommandName firstNode=super.buildChain(AbstractLS.class).get(0);
		//由于责任链模式，只要执行了就一定会返回一个结果
		return firstNode.handleMessage(vo);
	}

}
