
/**
 * Write a description of class EmployeeTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeTester
{
    public static void main(String[] args)
    {
        Employee ben = new Employee("Benjamin Gosling", 60000);
        ben.raiseSalary(15);  //raises salary by 15%
        
        Employee wilson = new Employee("Tom Hanks", 100000);
        wilson.raiseSalary(50.5); //raises salary by 50.5%
        
        System.out.println("Employees");
        System.out.println(ben.getName() + " : " + ben.getSalary());
        System.out.println(wilson.getName() + " : " + wilson.getSalary());
    }   
}
