package goodExample2;

public class DeductionContext {
     private IDeduction deduction=null;
     public DeductionContext(IDeduction _deduction){
    	 this.deduction=_deduction;
     }
     
     public boolean exec(Card card,Trade trade){
    	 return this.deduction.exec(card, trade);
     }
}
