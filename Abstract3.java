package Assignment1;

import java.util.Scanner;

abstract class Shape{
   public abstract double area();
}

class Circle extends Shape{
	
	private double area;
	
	public Circle(double radius)
	{
		this.area = Math.PI*Math.pow(radius, 2);
	}
	@Override
	public double area() {
		return area;
	}
}

class Rectangle extends Shape{
	private double length,breadth;
	
	public Rectangle(double length,double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return (length*breadth);
	}
}

class Square extends Shape{
	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return (side*side);
	}
}

public class Abstract3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius of the circle");
		double radius = sc.nextDouble();
		Circle c = new Circle(radius);
		System.out.printf("Area of the circle = %.2f",c.area());
		
		System.out.println("");
		System.out.println("Enter the length and bradth of the rectangle");
		double length =sc.nextDouble();
		double breadth = sc.nextDouble();
		Rectangle rt = new Rectangle(length,breadth);
		System.out.printf("Area of the rectangle = %.2f",rt.area());
		
		System.out.println("");
		System.out.println("Enter the side of the square");
		double side = sc.nextDouble();
		Square sq = new Square(side);
		System.out.printf("Area of the square = %.2f",sq.area());
	}
}
