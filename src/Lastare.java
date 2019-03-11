import java.util.ArrayList;

public class Lastare {

	private ArrayList<Vehicle> cars = new ArrayList<Vehicle>();
	int maxLast;

	protected Lastare(int mL) {
		maxLast = mL;
	}
	
	public int antal() {
		return cars.size();
	}
	
	public void lastaPå(Vehicle c) {
		if (cars.size() >= maxLast) {
			return;
		} else {
			cars.add(c);
		}
	}

	public void lastaAvFörsta() {
		if (cars.size() <= 0) {
			return;
		} else {
			cars.remove(0);
		}
	}

	public void lastaAvSista() {
		if (cars.size() <= 0) {
			return;
		} else {
			cars.remove(cars.size() - 1);
		}
	}

	public void updateAllPositions(Vehicle v) {
		for (Vehicle vehicle : cars) {
			vehicle.setX(v.getX());
			vehicle.setY(v.getY());
		}
	}
}
