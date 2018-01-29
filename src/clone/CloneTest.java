package clone;

public class CloneTest {
public static void main(String[] args)
{
	try{
		Employee original=new Employee("Xh",5000);
		original.setHireDay(2000,1,1);
		Employee copy=original.clone();
		copy.raiseSalary(10);
		copy.setHireDay(2002,12,31);
		System.out.println("copy="+copy);
	}
	
	catch(CloneNotSupportedException e){
		e.printStackTrace();
	}
}
}
