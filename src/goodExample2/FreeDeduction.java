package goodExample2;

public class FreeDeduction implements IDeduction{

	@Override
	public boolean exec(Card card, Trade trade) {
		// TODO �Զ����ɵķ������
		card.setFreeMoney(card.getFreeMoney()-trade.getAmount());
		return true;
	}

}
