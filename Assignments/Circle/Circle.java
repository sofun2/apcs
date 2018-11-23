import java.lang.*;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double r = input.nextDouble();
		System.out.println();
		System.out.println("Area of circle: " + (Math.PI * Math.pow(r, 2)));
		System.out.println("Circumference of circle: " + (Math.PI * 2 * r));
		System.out.println("Volume of sphere: " + (Math.PI * Math.pow(r, 3) * 4 / 3));
		System.out.println("Surface area of sphere: " + (4 * Math.PI * Math.pow(r, 2)));
	}
}
