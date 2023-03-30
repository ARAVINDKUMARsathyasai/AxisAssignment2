package Assignment1;

import java.util.Scanner;

@FunctionalInterface
interface MethodReference{
	void display(double area);
}

class Display {
	public void display(double area) {
		System.out.printf("Area = %.2f\n",area);
	}
}

public class Interface4 {
	public static void main (String ...args) {
		Scanner sc = new Scanner(System.in);
		double num1,num2,res;
		System.out.println("Enter the radius of the circle");
		num1=sc.nextFloat();
		res = Math.PI * Math.pow(num1, 2);
		
		Display dis = new Display();
		
		MethodReference ref = dis :: display;
		ref.display(res);
		
		System.out.println("Enter the length and breadth ");
		num1 = sc.nextDouble();
		num2=sc.nextDouble();
		res = num1*num2;
		
		ref.display(res);
		
		System.out.println("Enter the side of the squarer ");
		num1 = sc.nextDouble();
		res =  Math.pow(num1,2);
		
		ref.display(res);
	}
}
