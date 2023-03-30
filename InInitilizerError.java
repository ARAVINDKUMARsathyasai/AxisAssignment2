package Assignment1;

public class InInitilizerError {

	static {
		int num = 10/0;
		System.out.println(num);
	}
	
	public static void main(String args[]) {
		System.out.println("Hello world");
	}
}
