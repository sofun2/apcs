public class HourlyWorker extends Worker {

	public HourlyWorker(String n, double sr) {
		super(n, sr);
	}

	public double computePay(double hours) {
		if(hours > 40) {
			return super.computePay(40) + super.computePay((hours - 40) * 1.5);
		}
		else {
			return super.computePay(hours);
		}
	}
}