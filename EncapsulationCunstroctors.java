package Assignment1;

import java.util.Scanner;

class Detail{
	
	private String name;
	private String address;
	private int age;
	private long phoneNo;
	
	public Detail(String name, String address, int age, long phoneNo) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}
	
	
}

public class EncapsulationCunstroctors {
	public static void main(String[] args) {
		String name;
		String address;
		int age;
		long phoneNo;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name ");
		name = sc.next();
		System.out.println("Enter address ");
		address = sc.next();
		System.out.println("Enter age ");
		age = sc.nextInt();
		System.out.println("Enter phone number ");
		phoneNo = sc.nextLong();
		
		Detail dt = new Detail( name, address, age, phoneNo);
		
		
		
		System.out.println("Name as per the records = "+dt.getName());
		System.out.println("Address as per the records = "+dt.getAddress());
		System.out.println("Age as per the records = "+dt.getAge());
		System.out.println("Phone number as per the records = "+dt.getPhoneNo());
	}
}
