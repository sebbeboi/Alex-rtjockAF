package model;
import javafx.scene.paint.Color;

public class Scania extends Car {

	private int vinkel;

	/**
	 * Konstruktor som ger lastbilen vit f�rg, modellnamn Scania och enginePower
	 * 520.
	 */
	public Scania() {
		super(Color.WHITE, "Scania", 520);
		stopEngine();
	}

	/**
	 * speedFactor f�r lastbilen
	 */
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.001;
	}

	/**
	 * H�jer flaket p� lastbilen om den inte �r i fart.
	 */
	public void flakH�j() {
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
	 * S�nker flaket p� lastbilen om den inte �r i fart.
	 */
	public void flakS�nk() {
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