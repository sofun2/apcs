public class SalariedWorker extends Worker {

	public SalariedWorker(String n, double sr) {
		super(n, sr);
	}

	public double computePay(double hours) {
		return super.computePay(40);
	}
}