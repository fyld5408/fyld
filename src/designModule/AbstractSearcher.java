package designModule;

public abstract class AbstractSearcher {
   protected IGoodBodyGirl goodBodyGirl;
   protected IGreatTemperamentGirl greatTemperamentGirl;
   public AbstractSearcher(IGoodBodyGirl goodBodyGirl){
	   this.goodBodyGirl=goodBodyGirl;
   }
   public AbstractSearcher(IGreatTemperamentGirl greatTemperamentGirl){
	   this.greatTemperamentGirl=greatTemperamentGirl;
   }
   public AbstractSearcher(IGoodBodyGirl goodBodyGirl,IGreatTemperamentGirl greatTemperamentGirl){
	   this.goodBodyGirl=goodBodyGirl;
	   this.greatTemperamentGirl=greatTemperamentGirl;
   }
   public abstract void show();
}
