import java.lang.*;
import java.util.Scanner;

public class ReducedFraction {
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
		System.out.print("Enter a fraction: ");
		String s = input.next();
		String [] sa = s.split("/");
		int a = Integer.parseInt(sa[0]);
		int b = Integer.parseInt(sa[1]);
		System.out.print("Reduced Fraction: ");
		if(a == 0) {
			System.out.println(0);
		}
		else if(b == 0) {
			System.out.println("division by 0 error");
		}
		else {
			int c = gcd(a, b);
			System.out.println("Reduced Fraction: " + a/c + "/" + b/c);
		}
	}
}