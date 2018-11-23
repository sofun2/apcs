import java.util.*;

public class School {
	private String name;
	private ArrayList<Course> cs = new ArrayList<Course>();

	public School(String sname) {
		this.name = sname;
	}

	public String getName() {
		return this.name;
	}

	public void addCourse(Course c) {
		this.cs.add(c);
	}

	public int getStudentCount() {
		HashSet<String> hs = new HashSet<>();
		for(int i = 0; i < cs.size(); i++) {
			ArrayList<Student> cc = cs.get(i).getRoster();
			for(int j = 0; j < cc.size(); j++) {
				String tmp = cc.get(j).getName() + Double.toString(cc.get(j).getAverageScore());
				if(!hs.contains(tmp)) {
					hs.add(tmp);
				}
			}
		}
		return hs.size();
	}

	public void printCourseAndStudents() {
		for(int i = 0; i < cs.size(); i++) {
			System.out.println(cs.get(i).getName());
			ArrayList<Student> cc = cs.get(i).getRoster();
			for(int j = 0; j < cc.size(); j++) {
				System.out.println(cc.get(j).getName());
			}
			System.out.println("");
		}
	}

	public void printCourseEnrolled(String studentName) {
		System.out.println(studentName + " is enrolled in:");
		for(int i = 0; i < cs.size(); i++) {
			String tmp = cs.get(i).getName();
			ArrayList<Student> cc = cs.get(i).getRoster();
			for(int j = 0; j < cc.size(); j++) {
				if(cc.get(j).getName().equals(studentName)) {
					System.out.println(tmp);
					continue;
				}
			}
		}
	}

	public ArrayList<Course> getImpactedCourseList(int capacity) {
		ArrayList<Course> ret = new ArrayList<Course>();
		for(Course cc : cs) {
			if(cc.getSize() > capacity) {
				ret.add(cc);
			}
		}
		return ret;
	}

	public void printStudentsMultCourses(int numOfCourses) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < cs.size(); i++) {
			ArrayList<Student> cc = cs.get(i).getRoster();
			for(int j = 0; j < cc.size(); j++) {
				String tmp = cc.get(j).getName();
				if(!map.containsKey(tmp)) {
					map.put(tmp, 1);
				}
				else {
					map.replace(tmp, map.get(tmp) + 1);
				}
			}
		}	
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue() >= numOfCourses) {
				System.out.println(entry.getKey());
			}
		}
	}

	public void printTopStudentPerCourse() {
		for(Course cc : cs) {
			double mx = -1.0;
			for(Student ss : cc.getRoster()) {
				mx = Math.max(mx, ss.getAverageScore());
			}
			System.out.println(cc.getName());
			for(Student ss : cc.getRoster()) {
				if(ss.getAverageScore()== mx) {
					System.out.println(ss.getName());
				}
			}
			System.out.println();
		}
	}

}