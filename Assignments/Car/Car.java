import java.util.*;

public class Car {
	private double fuelEfficiency;
	private double fuelAmount = 0;

	public Car(double fe){
		this.fuelEfficiency = fe;
	}

	public void addGas(double gas) {
		this.fuelAmount += gas;
	}

	public void drive(double dist) {
		this.fuelAmount -= (dist / fuelEfficiency);
	}

	public double getGasInTank() {
		return fuelAmount;
	}
}