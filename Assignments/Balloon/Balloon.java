import java.util.*;

public class Balloon {

	private double V = 0.0;

	public void addAir(double amount) {
		this.V += amount;
	}

	public double getVolume() {
		return this.V;
	}

	public double getSurfaceArea() {
		double r = getRadius();
		return (4.0 * Math.PI * r * r);
	}

	public double getRadius() {
		return Math.cbrt(3.0 / 4.0 * this.V / Math.PI);
	}
}