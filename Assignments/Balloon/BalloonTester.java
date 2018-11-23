
/**
 * Write a description of class BalloonTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BalloonTester
{
    public static void main(String[] args)
    {
        Balloon balloon1 = new Balloon();
        Balloon balloon2 = new Balloon();
        
        balloon1.addAir(1436.76);
        balloon2.addAir(381.7);
        
        System.out.println("First balloon. Radius: " + balloon1.getRadius() + " units. Volume: " + balloon1.getVolume() + ". Surface Area: " + balloon1.getSurfaceArea());
        System.out.println("Second balloon. Radius: " + balloon2.getRadius() + " units. Volume: " + balloon2.getVolume() + ". Surface Area: " + balloon2.getSurfaceArea());
    }
    
}
