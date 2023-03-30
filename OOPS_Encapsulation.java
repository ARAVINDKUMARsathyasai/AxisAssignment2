package Assignment1;

import java.util.Scanner;

// Using getters and setters in this program.

class Details{
	private String name;
	private String address;
	private int age;
	private long phoneNo;
	
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
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}

public class OOPS_Encapsulation {
	public static void main(String ...args) {
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
		
		Details dt = new Details();
		
		dt.setName(name);
		dt.setAddress(address);
		dt.setAge(age);
		dt.setPhoneNo(phoneNo);
		
		System.out.println("Name as per the records = "+dt.getName());
		System.out.println("Address as per the records = "+dt.getAddress());
		System.out.println("Age as per the records = "+dt.getAge());
		System.out.println("Phone number as per the records = "+dt.getPhoneNo());
	}
}
