package CheckPassFail;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of number: ");
		int mark = sc.nextInt();
		if(mark > 50) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
	System.out.println();
	System.out.println("--------------------------");
	System.out.println("CHECK DONE");
	sc.close();
	}

}
