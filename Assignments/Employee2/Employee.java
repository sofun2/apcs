public class Employee {

	protected String name;
	protected double salary;

	public Employee(String n, double s) {
		this.name = n;
		this.salary = s;
	}

	public String toString() {
		return (this.name + " " + Double.toString(this.salary));
	}
}