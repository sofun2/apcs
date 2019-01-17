
/**
 * Write a description of class EmployeeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        boolean keepGoing = true;
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<Employee>();
        while(keepGoing)
        {
            System.out.println("Type [e] to add new employee.");
            System.out.println("Type [m] to add new manager.");
            System.out.println("Type [x] to add executive.");
            System.out.print("Type [q] to quit. ");
            String input = in.next();
            if (!input.equals("q"))
            {
                System.out.print("Enter name: ");
                String name = in.next();
                System.out.print("Enter salary: ");
                double s = in.nextDouble();
                if (input.equals("e"))
                {
                    Employee e = new Employee(name, s);
                    list.add(e);
                }
                else if (input.equals("m"))
                {
                    Manager m = new Manager(name, s);
                    System.out.print("Enter department: ");
                    m.assignDepartment(in.next());
                    list.add(m);
                }
                else
                {
                    Executive x = new Executive(name, s);
                    System.out.print("Enter department: ");
                    x.assignDepartment(in.next());
                    list.add(x);
                }
            }
            else
            {
                for (int i = 0; i < list.size(); i++)
                    System.out.println(list.get(i));
                keepGoing = false;
            }
        }
    }
    
}
