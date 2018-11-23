import java.util.Scanner;
import java.lang.Math;

public class SAS {
	public static void main(String[] args) {
		double sa, sb, ac, sc;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side length a: ");
		sa = input.nextDouble();
		System.out.print("Enter the side length b: ");
		sb = input.nextDouble();
		System.out.print("Enter the angle C in degrees: ");
		ac = input.nextDouble();
		System.out.println();
		sc = Math.sqrt(sa*sa+sb*sb-2*sa*sb*Math.cos(Math.toRadians(ac)));
		System.out.println("side length c: " + sc);
		System.out.println("angle A: " + Math.toDegrees(Math.acos((sc*sc+sb*sb-sa*sa)/(2*sb*sc))));
		System.out.println("angle B: " + Math.toDegrees(Math.acos((sc*sc+sa*sa-sb*sb)/(2*sa*sc))));
	}
}
