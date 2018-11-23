/**
 * Write a description of class BugTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class TriangleTester
{
    
    public static void main(String[] args)
    {
        //Creates a triangle with corners at
        //(2,5) , (4,1) , and (-2,0)
        Triangle t = new Triangle(2,5,4,1,-2,0);
        
        //prints the lengths of all three sides
        System.out.println("Lengths of the sides: ");
        t.printLengths();
        
        //prints perimeter
        System.out.println("The perimeter of the triangle: " + t.getPerimeter());
        
        //prints the interior angle measures of the triangle
        System.out.println("Angle measures: ");
        t.printAngleMeasures();
       
        
    }
        
}
