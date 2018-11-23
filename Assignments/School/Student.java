import java.util.*;

public class Student {
	private ArrayList<Double> a = new ArrayList<Double>();
	private String name;

	public Student(String s) {
		this.name = s;
	}

	public void addQuiz(double x) {
		a.add(x);
	} 

	public String getName() {
		return this.name;
	}

	public double getTotalScore() {
		double ret = 0;
		for(int i = 0; i < a.size(); i++) {
			ret += a.get(i);
		}
		return ret;
	}

	public double getAverageScore() {
		return (getTotalScore() / (double) a.size());
	}

}