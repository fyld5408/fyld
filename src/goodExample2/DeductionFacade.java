package goodExample2;


public class DeductionFacade {
     //����ģʽ�������ɷ�������װ�������ṩ���ϲ����
     public static Card deduct(Card card,Trade trade){
    	 StrategyMan reg=getDeductionType(trade);
    	 IDeduction deduction=StrategyFactory.getDeduction(reg);
    	 DeductionContext context=new DeductionContext(deduction);
    	 context.exec(card, trade);
    	 return card;
     }
     
     //��������ö�ٵ�ʹ��
     private static StrategyMan getDeductionType(Trade trade){
    	 if(trade.getTradeNo().contains("ab")){
    		 return StrategyMan.FreeDeduction;
    	 }
    	 else {
			return StrategyMan.SteadyDeduction;
		}
     }
}
