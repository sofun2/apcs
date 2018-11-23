import java.lang.*;
import java.util.Scanner;

public class Factoring {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String flag = "y";
		while(flag.equals("y")) {
			System.out.print("Enter a number: ");
			int n = input.nextInt();
			String dum = input.nextLine(); // dummy string to consume the newline character
			for(int i = 2; i < n && n > 1; i++) {
				if(n % i == 0) {
					System.out.println(i);
					n /= i;
					i -= 1;
				}
			}
			System.out.println(n);
			System.out.print("Continue? [y/n]: ");
			flag = input.nextLine();
		}
	}
}
