package CheckPassFail;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of number: ");
		int number = sc.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
		
		System.out.println("---------------------------");
		System.out.println("Bye!");
		sc.close();
	}

}
