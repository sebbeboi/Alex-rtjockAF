import javafx.scene.paint.Color;

public class Saab95 extends Car {

	private boolean turboOn;
	
	private Saab95() {
		super(Color.BLACK,"Saab95",125);
		stopEngine();
	}
	
	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}

}