package goodExample2;

public class StrategyFactory {
      public static IDeduction getDeduction(StrategyMan strategy){
    	  IDeduction deduction=null;
    	  try {
    		  //精髓，根据枚举的value值反射创建IDeduction
			deduction=(IDeduction)Class.forName(strategy.getValue()).newInstance();
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} 
    	  return deduction;
      }
}
