import java.util.*;

public class Triangle {

	private double ax, ay, bx, by, cx, cy;
	private double sa, sb, sc;

	Triangle(double a, double b, double c, double d, double e, double f) {
		this.ax = a;
		this.ay = b;
		this.bx = c;
		this.by = d;
		this.cx = e;
		this.cy = f;
		this.sa = Math.sqrt((this.cx - this.bx) * (this.cx - this.bx) + (this.cy - this.by) * (this.cy - this.by));
		this.sb = Math.sqrt((this.ax - this.cx) * (this.ax - this.cx) + (this.ay - this.cy) * (this.ay - this.cy));
		this.sc = Math.sqrt((this.ax - this.bx) * (this.ax - this.bx) + (this.ay - this.by) * (this.ay - this.by));
	}

	public void printLengths() {
		System.out.println(this.sa);
		System.out.println(this.sb);
		System.out.println(this.sc);
	}

	public double getPerimeter() {
		return (this.sa + this.sb + this.sc);
	}

	public void printAngleMeasures() {
		double aa = Math.acos((this.sb * this.sb + this.sc * this.sc - this.sa * this.sa) / (2 * this.sb * this.sc)) * 180.0 / Math.PI;
		double ab = Math.acos((this.sa * this.sa + this.sc * this.sc - this.sb * this.sb) / (2 * this.sa * this.sc)) * 180.0 / Math.PI;
		double ac = Math.acos((this.sb * this.sb + this.sa * this.sa - this.sc * this.sc) / (2 * this.sb * this.sa)) * 180.0 / Math.PI;
		System.out.println(aa);
		System.out.println(ab);
		System.out.println(ac);
	}

}