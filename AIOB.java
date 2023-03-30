package Assignment1;

import java.util.Scanner;

public class AIOB {
	public static void main(String ...args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		for(int i = 0;i<5;i++) {
				arr[i] = sc.nextInt();
		}
		try {
			System.out.println(arr[6]);
		}
		catch(ArrayIndexOutOfBoundsException exp) {
			exp.printStackTrace();			
		}
	}	
}
