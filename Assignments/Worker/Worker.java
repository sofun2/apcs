import java.util.*;

public class Worker {

	private String name;
	private double salaryRate;

	public Worker(String n, double sr) {
		this.name = n;
		this.salaryRate = sr;
	}

	public String toString() {
		return (this.name + " " + Double.toString(this.salaryRate));
	}

	public double computePay(double hours) {
		return hours * salaryRate;
	}
}