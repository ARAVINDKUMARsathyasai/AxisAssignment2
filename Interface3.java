package Assignment1;

import java.util.Scanner;

interface IShapes{
	double area();

	default void method() {
		System.out.println("Common Shapes we are dealing with are : \nCircle\nRectangle\nSquare");
	}
	
	public static void Constatnts() {
		System.out.println("Common constants that we use in this are :");
		System.out.println(Math.PI);
	}
}

class Circles implements IShapes{
	private float radius;
	
	public Circles() {}
	
	public Circles(float radius) {
		this.radius = radius;
	}
	@Override
	public double area() {
		return Math.PI * Math.pow(radius,2);
	}
}

class Rectangles implements IShapes{
    private	float len,bre;
	public Rectangles(float len, float bre) {
		this.len = len;
		this.bre = bre;
	}
	
	@Override
	public double area() {
		return len*bre;
	}
}

class Squares implements IShapes{
	private float side;
	
	public Squares(float side) {
		this.side = side;
	}
	
	public double area () {
		return Math.pow(side,2);
	}
	
}

public class Interface3 {
	static {
		IShapes s = new Circles();
		s.method();
		System.out.println("");
		IShapes.Constatnts();
		System.out.println("");
	}
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		float radius = sc.nextFloat();
		Circles cir = new Circles(radius);
		System.out.printf("Area of the circle = %.2f\n",cir.area());
		
		System.out.println("\nEnter the length and breadth of the rectangle ");
		float len,bre;
		len = sc.nextFloat();
		bre = sc.nextFloat();
		Rectangles ret = new Rectangles(len,bre);
		System.out.printf("Area of the Rectangle = %.2f\n",ret.area());
		
		System.out.println("\nEnter the side of the square ");
		float side;
		side = sc.nextFloat();
		Squares sq = new Squares(side);
		System.out.printf("Area of the square = %.2f",sq.area());
	}
}
