package Assignment1;

import java.util.Scanner;

class Calculator{
	public int sum(int a, int b) {
		System.out.println("Method with int a and int b");
		return (a+b);
	}
	public int sum(int ...a) {
		System.out.println("Method with var arguments");
		int sum = 0;
		for(int num : a)
			sum += num;
		return sum;
	}
	public double sum (int a , double b) {
	    System.out.println("Method with int a and double b");
		return (a+b);
	}
	
	public double sum (double a, int b) {
		System.out.println("Method with double a and int b");
		return (a+b);
	}
}

public class Overloadingg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		
		System.out.println("Enter the integer values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c[] = {10,20,30,40};		
		
		System.out.println("Enter fractional numbers");
		float f1=sc.nextFloat();
		float f2=sc.nextFloat();
		
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();
		
		System.out.println(cal.sum(a,b));
		System.out.println(cal.sum(c));
		System.out.println(cal.sum(a,f1));
		System.out.println(cal.sum(f2,b));
		System.out.println(cal.sum(a,d1));
		System.out.println(cal.sum(d2,b));		
	}
}
