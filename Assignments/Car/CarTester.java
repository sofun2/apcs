
/**
 * Write a description of class CarTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTester
{
    public static void main(String [] args)
    {
        Car pinto = new Car(35);
        pinto.addGas(10);
        pinto.drive(220);
        pinto.addGas(8);
        pinto.drive(250);
        System.out.println("Gas left in tank: " + pinto.getGasInTank());
    }
}
