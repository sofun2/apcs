
/**
 * Write a description of class SchoolTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SchoolTester
{
    public static void main(String[] args)
    {
        Student a = new Student("Annie");
        a.addQuiz(8.5);
        
        Student b = new Student("Benny");
        b.addQuiz(9.3);
        
        Student c = new Student("Charlie");
        c.addQuiz(6.7);
        
        Student d = new Student("Danny");
        d.addQuiz(8.6);
        
        Student e = new Student("Emily");
        e.addQuiz(9.25);

        Student f = new Student("Frankie");
        f.addQuiz(10);
        
        Student g = new Student("Gracie");
        g.addQuiz(7.8);
        
        Student h = new Student("Harry");
        h.addQuiz(9.25);
        
        Student ee = new Student("Emily");
        ee.addQuiz(9.5);
        
        Course calc = new Course("Calculus");
        Course bio = new Course("Biology");
        
        calc.addStudent(a);
        calc.addStudent(b);
        calc.addStudent(c);
        calc.addStudent(e);
        calc.addStudent(f);
        
        bio.addStudent(d);
        bio.addStudent(a);
        bio.addStudent(g);
        bio.addStudent(c);
        bio.addStudent(e);
        bio.addStudent(ee);
        
        School phhs = new School("Piedmont Hills HS");
        phhs.addCourse(calc);
        phhs.addCourse(bio);
        
        System.out.println(phhs.getName() + " enrollment is " + phhs.getStudentCount());
    }

}
