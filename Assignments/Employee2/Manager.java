public class Manager extends Employee {

	protected String department;

	public Manager(String n, double s) {
		super(n, s);
	}

	public String toString() {
		return (this.name + " " + Double.toString(this.salary) + " " + this.department);
	}

	public void assignDepartment(String dept) {
		this.department = dept;
	}

}