package Assignment1;

import java.util.Scanner;

class Person{
	private String name;
	private String address;
	private int age;
	private long phoneNo;
	
	public Person() {}
	
	public Person(String name, String address, int age, long phoneNo) {
		this.name = name;
		this.address = address;
		this.age= age;
		this.phoneNo = phoneNo;
	}
	
	public void display() {
		System.out.println("========================== Persnol details ==================================");
		System.out.println("Name as per the records = "+name);
		System.out.println("Address as per the records = "+address);
		System.out.println("Age as per the records = "+age);
		System.out.println("Phone number as per the records = "+phoneNo);
	}	
}

class Cricketer extends Person{
	private String team;
	private int totalMatchs;
	private long totalRuns;
	private boolean healthStatus;
	
	public Cricketer(String name, String address,int age, long phoneNo, String team, int totalMatchs, long totalRuns, boolean healthStatus) {
		super(name,address,age,phoneNo);
		this.team = team;
		this.totalMatchs=totalMatchs;
		this.totalRuns = totalRuns;
		this.healthStatus = healthStatus;
	}
	
	public void display() {
		super.display();
		System.out.println("");
		System.out.println("============================== Player track ==========================================");
		System.out.println("Team = "+team);
		System.out.println("Total matchs = "+totalMatchs);
		System.out.println("Total runs = "+totalRuns);
		if(healthStatus)
			System.out.println("Eligible for further games");
		else
			System.out.println("not eligible for next game");
	}
}

class Employe extends Person{
	private String company;
	private String desicnation;
	private String role;
	private long salary;
	
	public Employe(String name, String address,int age, long phoneNo,String company, String desicnation, String role, long salary) {
		super(name,address,age,phoneNo);
		this.company=company;
		this.desicnation=desicnation;
		this.role = role;
		this.salary= salary;
	}
	
	public void display() {
		super.display();
		System.out.println("");
		System.out.println("Working in "+company);
		System.out.println("Desicnation "+desicnation);
		System.out.println("Role "+role);
		System.out.println("Salary "+salary);
	}
}

public class Inheritances {
	
	static {
		System.out.println("Press 1 for the Cricketer data collection");
		System.out.println("Press 2 for the Employee data collection");
		System.out.println("Press 3 to exit the function");
	}
		
	public static void main(String[] args) {
		Cricketer ct[];
		Employe emp[];
		int choice;
		
		String name;
	    String address;
		int age;
		long phoneNo;
		
		String team;
		int totalMatchs;
		long totalRuns;
		boolean healthStatus;
		
		String company;
		String desicnation;
		String role;
		long salary;
		
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		int totalCric = 0;
		int totalEmp = 0;
		
		ct = new Cricketer[totalCric];
		emp = new Employe[totalEmp];
		
		if(choice == 1)
		{
		System.out.println("Enter total number of Cricketer");
		totalCric = sc.nextInt();
		ct = new Cricketer[totalCric];
		}
		else if (choice == 2) {
		System.out.println("Enter the total number of employees");
		totalEmp = sc.nextInt();
		emp = new Employe[totalEmp];
		}
		l1:{
			while(true) {
			switch(choice) {
				case 1:
					for (int i = 0;i<totalCric;i++) {
						System.out.println("Enter the name of the player"+(i+1));
						name=sc.next();
						System.out.println("Enter the address of the player "+(i+1));
						address=sc.next();
						System.out.println("Enter the age of the player "+(i+1));
						age = sc.nextInt();
						System.out.println("Enter the phone number of the player "+(i+1));
						phoneNo = sc.nextLong();
						System.out.println("Enter the team of the player "+(i+1));
						team=sc.next();
						System.out.println("Enter the total matches played by the player"+(i+1));
						totalMatchs = sc.nextInt();
						System.out.println("Enter the total runs scored by the player"+(i+1));
						totalRuns=sc.nextLong();
						int op;
						System.out.println("Health status of the player \npress 1 for good \npress 2 for not good");
						op = sc.nextInt();
						if(op == 1)
							healthStatus = true;
						else
							healthStatus = false;
						
						ct[i] = new Cricketer(name, address, age, phoneNo, team, totalMatchs, totalRuns, healthStatus);
					}
					System.out.println("Enter next choice ");
					break l1;
				case 2:
					for(int i = 0;i<totalEmp;i++) {
						System.out.println("Enter the name of the Employee"+(i+1));
						name=sc.next();
						System.out.println("Enter the address of the Employee "+(i+1));
						address=sc.next();
						System.out.println("Enter the age of the Employee "+(i+1));
						age = sc.nextInt();
						System.out.println("Enter the phone number of the Employee "+(i+1));
						phoneNo = sc.nextLong();
						System.out.println("Enter the company name of the Employee"+(i+1));
						company=sc.next();
						System.out.println("Enter the desicnation of the Employee"+(i+1));
						desicnation=sc.next();
						System.out.println("Enter the role of the Employee"+(i+1));
						role=sc.next();
						System.out.println("Enter the salary of the Employee"+(i+1));
						salary=sc.nextLong();
						
						emp[i] = new Employe(name, address, age, phoneNo, company, desicnation, role, salary);
					}
					System.out.println("Enter next choice ");
					break l1;
				case 3:break l1;
				default :
					System.out.println("Invalid input");
			}
		 }	
		}

		for(int i = 0; i<totalCric;i++) {
			System.out.println("==============================Details of Cricketer "+(i+1)+"====================================");
			ct[i].display();
		 }
		
		for (int i =0;i<totalEmp;i++) {
			System.out.println("==============================Details of Employee "+(i+1)+"====================================");
			emp[i].display();
		}
	}

}
