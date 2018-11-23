
/**
 * Write a description of class BugTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class CourseTester

{
   public static void main(String[] args)
   {
     
       boolean cont = true;
       Scanner in = new Scanner(System.in);
       System.out.print("What is class size: ");
       int size = in.nextInt();
       Course compSci = new Course(size);
       
       for (int i = 0; i < size; i++)
       {
           System.out.print("What is student name? ");
           String name = in.next();
           System.out.print("How many quizzes? ");
           int numberOfQuiz = in.nextInt();
           Student s = new Student(name);
           
           for (int j = 1; j <= numberOfQuiz; j++)
           {
               System.out.print("Enter score for quiz #" + j + " :");
               int score = in.nextInt();
               s.addQuiz(score);
            }
           compSci.addStudent(s);
        }
       compSci.printRoster();   
       

      
    }
}