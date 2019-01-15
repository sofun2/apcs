import java.util.*;

public class Person {

	private int yearOfBirth;
	private String name;

	public Person(int yob, String n) {
		this.name = n;
		this.yearOfBirth = yob;
	}

	public String toString() {
		return (this.name + " " + Integer.toString(this.yearOfBirth));
	}

}