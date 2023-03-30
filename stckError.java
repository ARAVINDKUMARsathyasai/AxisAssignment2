package Assignment1;

public class stckError {
	public static void main(String ...args) {
		stckError st = new stckError();
		st.methodOne();
	}
	void methodOne() {
		methodTwo();
	}
	
	void methodTwo() {
		methodOne();
	}
}
