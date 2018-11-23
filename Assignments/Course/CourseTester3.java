
/**
 * Write a description of class CourseTester1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.*;
public class CourseTester3
{
    public static void main(String[] args)
    {
        Course calc = new Course(3);  //3 students
        
        // Student a = new Student("Ana");
        // a.addQuiz(7);
        // a.addQuiz(9);
        // calc.addStudent(a);
        
        Student b = new Student("Billy");
        b.addQuiz(5);
        b.addQuiz(9);
        
        Student c = new Student("Charlie");
        c.addQuiz(8);
        c.addQuiz(8);
        
        Student d = new Student("Dave");
        d.addQuiz(8);
        d.addQuiz(8);
        d.addQuiz(8);
        
        calc.addStudent(b);
        calc.addStudent(c);
        calc.addStudent(d);
        
        ArrayList<Student> highest = calc.getHighestAverage();
        
        // for (int i = 0; i < highest.length; i++)
        // {
        //     System.out.println(highest[i].getName());
        // }
        

        // arraylist
        for(int i = 0; i < highest.size(); i++) {
            System.out.println(highest.get(i).getName());
        }
    }
    
}
