package goodExample2;

public enum StrategyMan {
	SteadyDeduction("goodExample2.SteadyDeduction"),
	FreeDeduction("goodExample2.FreeDeduction");
    String value="";
    private StrategyMan(String _value){
    	this.value=_value;
    }
    public String getValue(){
    	return this.value;
    }
}
