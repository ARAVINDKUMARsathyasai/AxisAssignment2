package Assignment1;

import java.util.Scanner;

public class Handling {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int num1,num2;
		try {
			System.out.println("Enter the first number that to be divided");
			num1 = sc.nextInt();
			System.out.println("enter the secound number that has to divide");
			num2 = sc.nextInt();
			System.out.println(num1/num2);
		}
		catch(ArithmeticException ex) {
			System.out.println("make it bit meaning full anything by zero is infinite");
			System.out.println(ex);
		}
		
		System.out.println("Code terminated gracefully ");
	}
}
