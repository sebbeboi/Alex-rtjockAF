import java.util.ArrayList;

import javafx.scene.paint.Color;

public class VolvoFMX extends Car{
	
	ArrayList<Car> cars = new ArrayList<Car>();
	private boolean rampNere;
	private int maxLast = 2;
	private int maxBilBredd = 200;
	private int maxBilLängd = 500;
	private int nuvBilBredd;
	private int nuvBilLängd;
	
	/**
	 * Konstruktor som ger transportbilen svart färg, modellnamn VolvoFMX och enginePower 520.
	 */
	public VolvoFMX() {
		super(Color.BLACK,"VolvoFMX",520);
		stopEngine();
	}

	/**
	 * speedFactor för transportbilen
	 */
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.001;
	}
	
	/**
	 * Höjer rampen på transportbilen om den inte är i fart.
	 */
	public void rampHöj() {
		if (getCurrentSpeed() > 0) {
			return;
		}
		else {
			rampNere = false;
		}
	}
	
	/**
	 * Sänker rampen på transportbilen om den inte är i fart.
	 */
	public void rampSänk() {
		if (getCurrentSpeed() > 0) {
			return;
		}
		else {
			rampNere = true;
		}
	}
	
	public void lastaPå(Car c) {
		if (cars.size() >= maxLast) {
			return;
		}
		else if (rampNere == true && (nuvBilBredd > maxBilBredd || nuvBilLängd > maxBilLängd)){
			cars.add(c);
		}
	}
	
	public void lastaAv() {
		if (cars.size() <= 0) {
			return;
		}
		else if (rampNere == true) {
			cars.remove(cars.size()-1);
		}
	}
}

