/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class DataSetTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        DataSet s = new DataSet();
        boolean keepGoing = true;
        while (keepGoing)
        {
            System.out.print("Enter a value ");
            int value = in.nextInt();
            s.addValue(value);
            System.out.print("Enter more value? ");
            String response  = in.next();
            if (response.equalsIgnoreCase("n"))
            {
                System.out.println("Sum = " + s.getSum());
                System.out.println("Average = " + s.getAverage());
                System.out.println("Min = " + s.getSmallest());
                System.out.println("Max = " + s.getLargest());
                keepGoing = false;
            }
        }
    }
}
            
            
    
        
    

