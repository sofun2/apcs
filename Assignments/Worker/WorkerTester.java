public class WorkerTester
{
   public static void main(String[] args)
   {
       Worker w = new Worker("Willy", 30); //Willy gets paid at $30/hour
       Worker h = new HourlyWorker("Harry", 50); //Harry gets paid at $50/hour
       Worker s = new SalariedWorker("Sally",50); //Sally gets paid at $50/hour
       
       System.out.println(w + " " + w.computePay(35));  //Willy worked 35 hours this week
       System.out.println(h +  "  " + h.computePay(42));    //Harry worked 42 hours this week, 40 hours at $50/hour and 2 hours at $75/hour
       System.out.println(s + "  " + s.computePay(45));    //Sally worked 45 hours this week, but only gets paid for 40 hours at $50/hour
    }
}