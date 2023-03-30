package Assignment1;

import java.util.Scanner;

class UnderAgeException extends RuntimeException{
	public UnderAgeException() {
		super("Your age is less not eligible");
	}
}

class OverAgeException extends RuntimeException{
	public OverAgeException() {
		super("Your age is more try to walk properly first");
	}
}

public class CustomException {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age;
		try {
			System.out.println("enter the age");
			age = sc.nextInt();
			if(age<18) {
				throw new UnderAgeException();
			}
			else if (age > 65) {
				throw new OverAgeException();
			}
			else {
				System.out.println("You are eligible to apply for driving licence");
			}			
		}
		catch (UnderAgeException ua) {
			ua.printStackTrace();
		}
		catch(OverAgeException ov) {
			ov.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		CustomException.main(new String [] {});
	}
}
