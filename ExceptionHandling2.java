package Assignment1;

import java.util.Scanner;

class InvalidPassword extends RuntimeException{
	public InvalidPassword() {
		super("Password length missmatch");
	}
}

public class ExceptionHandling2 {
	static {
		System.out.println("Enter the password with atleast 10 characters");
	}
	public static void main (String ...args) {
		String pass;
		Scanner sc = new Scanner(System.in);
		try{
			pass = sc.nextLine();
			if(pass.length()!=10) {
				throw new InvalidPassword();
			}
			System.out.println("Your password "+pass+" is correct");
		}
		catch(InvalidPassword pas) {
			pas.printStackTrace();
		}
		ExceptionHandling2.main(args);
	}
}
