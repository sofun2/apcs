/**
 * Write a description of class CourseTester1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CourseTester1
{
    public static void main(String[] args)
    {
        Course calc = new Course(3);  //3 students
        
        Student a = new Student("Ana");
        a.addQuiz(8);
        a.addQuiz(9);
        calc.addStudent(a);
        
        Student b = new Student("Billy");
        b.addQuiz(10);
        b.addQuiz(9);
        
        Student c = new Student("Charlie");
        c.addQuiz(7);
        c.addQuiz(7);
        
        calc.addStudent(b);
        calc.addStudent(c);
        
        System.out.println(calc.getStudentAverage("Billy"));
        calc.studentsScoredAboveAverage(7.2);  //expects to see "Ana" and "Billy"
    }
    
}
