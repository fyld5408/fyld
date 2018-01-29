package xhTest;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.context.ApplicationListener;


public class xh {

	
   public static void main(String[] args)
   {
	   Employee[]staff=new Employee[3];
	   staff[0]=new Employee("xh1", 3500);
	   staff[1]=new Employee("xh2", 7500);
	   staff[2]=new Employee("xh3", 3800);
	   
	   Arrays.sort(staff);
	   
	   for(Employee e:staff)
		   System.out.println("name="+e.getName()+",salary=" + e.getSalary());
   }
   
}
 class Employee 
{
	 private String name;
	 private double salary;
	 
	  public Employee(String n,double s){
		  name=n;
		  salary=s;
	  }
	  
	  public String getName(){
		  return name;
	  }
	  
	  public double getSalary(){
		  return salary;
	  }
	  
	  public int compareTo(Employee other){
		  return name.compareTo(other.name);
	  }
	  
}


