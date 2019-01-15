import java.util.*;

public class Instructor extends Person {

	private int salary;

	public Instructor(int yob, String n, int s) {
		super(yob, n);
		this.salary = s;
	}

	public String toString() {
		return (super.toString() + " " + Integer.toString(this.salary));
	}

}