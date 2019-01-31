import javafx.scene.paint.Color;

public abstract class Car implements Movable{

	private final static double trimFactor = 1.25;
	private double xPos;
	private double yPos;
	private int direction;

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name

	private boolean turboOn;
	
	public void move() {
		
	}
	
	public void turnRight() {
		
	}
	
	public void turnLeft() {
		
	}
	
	public Car(Color c, String m, double ep) {
		color = c;
		modelName = m;
		enginePower = ep;
	}
	
	protected double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return getEnginePower() * 0.01 * turbo;
	}
	
	protected double getEnginePower() {
		return enginePower;
	}

	protected double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	public void setTurboOn() {
		turboOn = true;
	}

	public void setTurboOff() {
		turboOn = false;
	}

	private void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}
	
}
