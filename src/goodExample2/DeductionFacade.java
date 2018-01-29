package goodExample2;


public class DeductionFacade {
     //门面模式，将若干方法都组装进来，提供给上层调用
     public static Card deduct(Card card,Trade trade){
    	 StrategyMan reg=getDeductionType(trade);
    	 IDeduction deduction=StrategyFactory.getDeduction(reg);
    	 DeductionContext context=new DeductionContext(deduction);
    	 context.exec(card, trade);
    	 return card;
     }
     
     //精髓在于枚举的使用
     private static StrategyMan getDeductionType(Trade trade){
    	 if(trade.getTradeNo().contains("ab")){
    		 return StrategyMan.FreeDeduction;
    	 }
    	 else {
			return StrategyMan.SteadyDeduction;
		}
     }
}
