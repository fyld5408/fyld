package goodExample2;

public class FreeDeduction implements IDeduction{

	@Override
	public boolean exec(Card card, Trade trade) {
		// TODO 自动生成的方法存根
		card.setFreeMoney(card.getFreeMoney()-trade.getAmount());
		return true;
	}

}
