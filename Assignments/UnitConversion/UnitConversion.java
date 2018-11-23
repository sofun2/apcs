import java.lang.*;
import java.util.Scanner;

public class UnitConversion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the measurement in meters: ");
		double m = input.nextDouble();
		System.out.println();
		System.out.println("Miles: " + (m * 0.000621371));
		System.out.println("Feet: " + (m * 0.000621371 * 5280));
		System.out.println("Inches: " + (m * 0.000621371 * 5280 * 12));
	}
}