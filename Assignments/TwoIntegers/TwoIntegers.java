import java.lang.*;
import java.util.Scanner;

public class TwoIntegers {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first integer: ");
		int a = input.nextInt();
		System.out.print("Please enter the second integer: ");
		int b = input.nextInt();
		System.out.println();
		System.out.println("Sum: " + (a + b));
		System.out.println("Difference: " + (a - b));
		System.out.println("Product: " + (a * b));
		System.out.println("Average: " + ((a + b) / (double)2));
		System.out.println("Range: " + Math.abs(a - b));
		System.out.println("Math.maximum: " + Math.max(a,b));
		System.out.println("Math.minimum: " + Math.min(a,b));
	}
}