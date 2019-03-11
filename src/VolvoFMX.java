import javafx.scene.paint.Color;

public class VolvoFMX extends Car{
	
	private boolean rampNere;
	private int maxBilBredd = 200;
	private int maxBilLängd = 500;
	private int nuvBilBredd;
	private int nuvBilLängd;
	
	Lastare lastare = new Lastare(2);
	
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
	
	public void rampKollPå(Car c) {
		if (rampNere == true && nuvBilBredd <= maxBilBredd || nuvBilLängd <= maxBilLängd) {
			lastare.lastaPå(c);
		}
		else {
			return;
		}
	}
	
	public void rampKollAv() {
		if (rampNere == true && nuvBilBredd <= maxBilBredd || nuvBilLängd <= maxBilLängd) {
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

