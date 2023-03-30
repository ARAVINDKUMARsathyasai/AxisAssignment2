package Assignment1;

public class SIOB {
	public static void main(String ...args) {
		String str = new String("ARAVINDKUMAR S BOBBA");
		try {
			System.out.println(str.charAt(25));
		}
		catch(StringIndexOutOfBoundsException exp){
			exp.printStackTrace();
		}
	}
}
