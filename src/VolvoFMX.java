import javafx.scene.paint.Color;

public class VolvoFMX extends Car{
	
	private boolean rampNere;
	private int maxBilBredd = 200;
	private int maxBilL�ngd = 500;
	private int nuvBilBredd;
	private int nuvBilL�ngd;
	
	Lastare lastare = new Lastare(2);
	
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
	
	public void rampKollP�(Car c) {
		if (rampNere == true && nuvBilBredd <= maxBilBredd || nuvBilL�ngd <= maxBilL�ngd) {
			lastare.lastaP�(c);
		}
		else {
			return;
		}
	}
	
	public void rampKollAv() {
		if (rampNere == true && nuvBilBredd <= maxBilBredd || nuvBilL�ngd <= maxBilL�ngd) {
			lastare.lastaAvSista();
		}
		else {
			return;
		}
	}
	
	@Override
	public void move() {
		super.move();
		lastare.updateAllPositions(this);
	}
}

