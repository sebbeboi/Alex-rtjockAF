import java.util.ArrayList;

import javafx.scene.paint.Color;

public class VolvoFMX extends Car{
	
	ArrayList<Car> cars = new ArrayList<Car>();
	private boolean rampNere;
	private int maxLast = 2;
	private int maxBilBredd = 200;
	private int maxBilL�ngd = 500;
	private int nuvBilBredd;
	private int nuvBilL�ngd;
	
	/**
	 * Konstruktor som ger transportbilen svart f�rg, modellnamn VolvoFMX och enginePower 520.
	 */
	public VolvoFMX() {
		super(Color.BLACK,"VolvoFMX",520);
		stopEngine();
	}

	/**
	 * speedFactor f�r transportbilen
	 */
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.001;
	}
	
	/**
	 * H�jer rampen p� transportbilen om den inte �r i fart.
	 */
	public void rampH�j() {
		if (getCurrentSpeed() > 0) {
			return;
		}
		else {
			rampNere = false;
		}
	}
	
	/**
	 * S�nker rampen p� transportbilen om den inte �r i fart.
	 */
	public void rampS�nk() {
		if (getCurrentSpeed() > 0) {
			return;
		}
		else {
			rampNere = true;
		}
	}
	
	public void lastaP�(Car c) {
		if (cars.size() >= maxLast) {
			return;
		}
		else if (rampNere == true && (nuvBilBredd > maxBilBredd || nuvBilL�ngd > maxBilL�ngd)){
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

