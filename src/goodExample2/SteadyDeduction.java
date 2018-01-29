package goodExample2;

public class SteadyDeduction implements IDeduction{

	@Override
	public boolean exec(Card card, Trade trade) {
		// TODO �Զ����ɵķ������
		int half=(int)Math.rint(trade.getAmount()/2.0);
		card.setFreeMoney(card.getFreeMoney()-half);
		card.setSteadyMoney(card.getSteadyMoney()-half);
		return true;
	}

}
