import java.lang.*;
import java.util.Scanner;

public class IntersectingRectangles {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		double ax1, ay1, aw, al, bx1, by1, bw, bl;
		System.out.print("Enter the first x coordinate: ");
		ax1 = input.nextDouble();
		System.out.print("Enter the first y coordinate: ");
		ay1 = input.nextDouble();
		System.out.print("Enter the first length (vertical): ");
		al = input.nextDouble();
		System.out.print("Enter the first width (horizontal): ");
		aw = input.nextDouble();
		System.out.print("Enter the second x coordinate: ");
		bx1 = input.nextDouble();
		System.out.print("Enter the second y coordinate: ");
		by1 = input.nextDouble();
		System.out.print("Enter the second length (vertical): ");
		bl = input.nextDouble();
		System.out.print("Enter the second width (horizontal): ");
		bw = input.nextDouble();
        System.out.println("The area of intersection is " + Math.max(0, (Math.min(ay1 + al, by1 + bl) - Math.max(ay1, by1))) * Math.max(0, (Math.min(ax1 + aw, bx1 + bw) - Math.max(ax1, bx1))));
	}
}
