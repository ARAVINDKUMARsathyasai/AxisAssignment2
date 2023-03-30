package Assignment1;

class Employee{
	 String name;
	 int age;
	 String address;
	
}

public class NullPointer {
	public static void main(String args[]) {
		Employee emp[] = new Employee[10];
		System.out.println(emp[0].name);
	}
}
