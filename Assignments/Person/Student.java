import java.util.*;

public class Student extends Person {

	private String major;

	public Student(int yob, String n, String m) {
		super(yob, n);
		this.major = m;
	}

	public String toString() {
		return (super.toString() + " " + this.major);
	}

}