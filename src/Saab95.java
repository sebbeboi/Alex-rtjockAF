import javafx.scene.paint.Color;

public abstract class Saab95 extends Car {
	
	private boolean turboOn;
	
	public Saab95() {
		super(Color.BLACK,"Saab95",125);
		stopEngine();
	}
	
	public void turboOn() {
		
	}
	
	public void turboOff() {
		
	}
	
	@Override
	protected double speedFactor() {
		return getEnginePower() * 0.005;
	}

}