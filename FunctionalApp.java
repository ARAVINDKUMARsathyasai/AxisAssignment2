package Assignment1;

import java.util.Scanner;

@FunctionalInterface
interface IFShape{
	double area(double ...x);
}

public class FunctionalApp {
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		float rad;
		System.out.println("Enter the radius of the circle ");
		rad = sc.nextFloat();
		
		IFShape c = (double ...ra)-> (Math.PI*ra[0]*ra[0]);
		
		System.out.printf("Area of the circle = %.2f\n",c.area(rad));
		
		System.out.println("\nEnter the length and breadth of the rectangle");
		float len,bre;
		len = sc.nextFloat();
		bre = sc.nextFloat();
		
		IFShape rect = (double ...ra) -> (ra[0]*ra[1]);
		System.out.printf("Area of the rectangele = %.2f \n",rect.area(len,bre));
		
		System.out.println("\nEnter the side of a square");
		len = sc.nextFloat();
		IFShape sqr = (double... ra) -> ra[0]*ra[0];;
		System.out.printf("Area of the square = %.2f\n",sqr.area(len));
	}
}
