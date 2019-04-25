package model;
import javafx.scene.paint.Color;

public class Scania extends Car {

	private int vinkel;

	/**
	 * Konstruktor som ger lastbilen vit färg, modellnamn Scania och enginePower
	 * 520.
	 */
	public Scania() {
		super(Color.WHITE, "Scania", 520);
		stopEngine();
	}

	/**
	 * speedFactor för lastbilen
	 */
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.001;
	}

	/**
	 * Höjer flaket på lastbilen om den inte är i fart.
	 */
	public void flakHöj() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			vinkel++;
			if (vinkel > 70) {
				vinkel = 70;
			}
		}
	}

	/**
	 * Sänker flaket på lastbilen om den inte är i fart.
	 */
	public void flakSänk() {
		if (getCurrentSpeed() > 0) {
			return;
		} else {
			vinkel--;
			if (vinkel < 0) {
				vinkel = 0;
			}
		}
	}
}