import java.lang.*;
import java.util.Scanner;

public class PrimeNumber {

	public static boolean isPrime(int n) {
		for(int i = 2; i < n && i < Math.sqrt(n) + 2; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String flag = "y";
		while(flag.equals("y")) {
			System.out.print("Enter a number: ");
			int n = input.nextInt();
			String dum = input.nextLine(); // dummy string to consume the newline character
			for(int i = 2; i <= n; i++) {
				if(isPrime(i)) 
					System.out.println(i);
			}
			System.out.print("Continue? [y/n]: ");
			flag = input.nextLine();
		}
	}
}
