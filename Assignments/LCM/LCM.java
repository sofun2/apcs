import java.lang.*;
import java.util.Scanner;

public class LCM {
	public static int gcd(int a, int b) {
		int t;
		while(b != 0) {
			t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first integer: ");
		int a = input.nextInt();
		System.out.print("Please enter the second integer: ");
		int b = input.nextInt();
		System.out.println("The LCM is " + a * b / gcd(a, b));
	}
}