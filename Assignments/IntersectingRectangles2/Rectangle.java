import java.lang.*;
import java.util.Scanner;

public class Rectangle {
	public double x, y, w, l;

	public Rectangle() {;}
	public Rectangle(double xx, double yy, double ww, double ll) {
		this.x = xx;
		this.y = yy;
		this.w = ww;
		this.l = ll;
	}
	public static Rectangle Intersection(Rectangle a, Rectangle b) {
		return new Rectangle(Math.max(a.x, b.x), Math.max(a.y, b.y), Math.abs(Math.min(a.x + a.w, b.x + b.w) - Math.max(a.x, b.x)), Math.abs(Math.min(a.y + a.l, b.y + b.l) - Math.max(a.y, b.y)));
	}

	public void setRectangle() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the x coordinate: ");
		this.x = input.nextDouble();
		System.out.print("Enter the y coordinate: ");
		this.y = input.nextDouble();
		System.out.print("Enter the width (horizontal): ");
		this.w = input.nextDouble();
		System.out.print("Enter the length (vertical): ");
		this.l = input.nextDouble();
	}

}
