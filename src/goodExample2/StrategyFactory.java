package goodExample2;

public class StrategyFactory {
      public static IDeduction getDeduction(StrategyMan strategy){
    	  IDeduction deduction=null;
    	  try {
    		  //���裬����ö�ٵ�valueֵ���䴴��IDeduction
			deduction=(IDeduction)Class.forName(strategy.getValue()).newInstance();
		} catch (Exception e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} 
    	  return deduction;
      }
}
