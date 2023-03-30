package Assignment1;


public class Exceptions {

	// Class fo an example for Arithmetic exception
	public static void main(String[] args) {
		try {
			System.out.println(50/0);
		}
		catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
	}
}
