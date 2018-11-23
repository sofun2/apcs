/**
 * Write a description of class StudentTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class StudentTester
{
   public static void main(String[] args)
   {
       boolean cont = true;
       Scanner in = new Scanner(System.in);
       System.out.print("Enter student's name: ");
       String name = in.next();
       Student s = new Student(name);
       while (cont)
       {
           System.out.print("Enter a new quiz score: ");
           int score = in.nextInt();
           s.addQuiz(score);
           System.out.print("Continue (y/n)? ");
           String response = in.next();
           if (response.equalsIgnoreCase("n"))
           {
               System.out.println("Student name: " + s.getName());
               System.out.println("Total quiz score: " + s.getTotalScore());
               System.out.println("Average quiz score: " + s.getAverageScore());
               cont = false;
            }
        }
       }
}

