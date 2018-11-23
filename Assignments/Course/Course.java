import java.util.*;

public class Course {
	private ArrayList<Student> ss = new ArrayList<Student>();

	public Course (int sz) {;}

	public void addStudent(Student s) {
		ss.add(s);
	} 

	public void printRoster() {
		System.out.println("Name \t Average Score");
		for(int i = 0; i < ss.size(); i++) {
			System.out.println(ss.get(i).getName() + "\t" + ss.get(i).getAverageScore());
		}
	}

	public double getStudentAverage(String nm) {
		for(int i = 0; i < ss.size(); i++) {
			if(ss.get(i).getName().equals(nm)) {
				return ss.get(i).getAverageScore();
			}
		}
		return -1;
	}

	public void studentsScoredAboveAverage(double score) {
		for(int i = 0; i < ss.size(); i++) {
			if(ss.get(i).getAverageScore() >= score) {
				System.out.println(ss.get(i).getName());
			}
		}
	}

	public ArrayList<Student> getHighestAverage() {
		ArrayList<Student> ret = new ArrayList<Student>();
		double h = 0.0;
		for(int i = 0; i < ss.size(); i++) {
			h = Math.max(h, ss.get(i).getAverageScore());
		}
		for(int i = 0; i < ss.size(); i++) {
			if(ss.get(i).getAverageScore() == h) {
				ret.add(ss.get(i));
			}
		}
		return ret;
	}

	public void removeStudent(String studentName) {
		for(int i = 0; i < ss.size(); i++) {
			if(ss.get(i).getName().equals(studentName)) {
				ss.remove(i);
			}
		}
	}

}