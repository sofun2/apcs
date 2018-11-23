
/**
 * Write a description of class BugTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class BugTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Bug bug = new Bug(5); //starting position is 5
        boolean cont = true;
        while(cont)
        {
            System.out.println("Type 'm' to move the bug. ");
            System.out.println("Type 't' to turn the bug. ");
            System.out.println("Type any other key to quit. ");
            String response = in.next();
            if(response.equals("m"))
                bug.move();
            else if (response.equals("t"))
                bug.turn();
            else
            {
                System.out.println("The position is " + bug.getPosition());
                cont = false;
            }
        
        }
    }
}
