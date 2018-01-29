package designModule;

import java.util.ArrayList;

public class Director {
     private ArrayList<String> sequence=new ArrayList<String>();
     private BenzBuilder benzBuilder=new BenzBuilder();
     
     public HummerH1Model1 getABenzModel(){
    	    this.sequence.clear();
    	    this.sequence.add("start");
    	    this.sequence.add("stop");
    	    this.benzBuilder.setSequence(sequence);
    	    return (HummerH1Model1)this.benzBuilder.getCarModel();
     }
     
     public HummerH1Model1 getBBenzModel(){
    	 this.sequence.clear();
    	 this.sequence.add("start");
    	 this.benzBuilder.setSequence(sequence);
    	 return (HummerH1Model1)this.benzBuilder.getCarModel();
     }
}
