import javafx.scene.paint.Color;

public abstract class Volvo740 extends Car {
	
	public final static double trimFactor = 1.25;
	
	public Volvo740() {
		super(Color.RED,"Volvo740",100);
		stopEngine();
	}
	
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.01 * trimFactor;
	}

}