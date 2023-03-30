package Assignment1;

class Employee{
	 final float salary=50000;
	}

public class inheritanceSimple extends Employee{
 	private int bonus=15000;
   	 public static void main(String args[]){
		 inheritanceSimple in =new inheritanceSimple();
	   System.out.println("Employee salary is:"+in.salary);
	   System.out.println("Bonus of Employee is:"+in.bonus);
	}
}

