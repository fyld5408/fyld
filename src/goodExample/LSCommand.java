package goodExample;

public class LSCommand extends Command{

	@Override
	public String execute(CommandVO vo) {
		//���裬ͨ��AbstractLs����һ������������ȡ��һ��������
		CommandName firstNode=super.buildChain(AbstractLS.class).get(0);
		//����������ģʽ��ֻҪִ���˾�һ���᷵��һ�����
		return firstNode.handleMessage(vo);
	}

}
