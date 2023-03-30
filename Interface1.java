package Assignment1;

import java.util.Scanner;

abstract interface IExample{
	void benifits();
}

class LemonTea implements IExample{
	public void benifits() {
		System.out.println("This tea is to taste good");
	}
}

class GreenTea extends LemonTea{
	public void benifits() {
		System.out.println(" This tea is for the health benifits");
	}
}

public class Interface1{
	public static void main(String ...args) {
		LemonTea lt = new LemonTea();
		lt.benifits();
		
		System.out.println("");
		
		GreenTea gt = new GreenTea();
		gt.benifits();
	}
}
