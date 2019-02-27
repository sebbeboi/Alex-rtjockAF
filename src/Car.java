import javafx.scene.paint.Color;

public abstract class Car implements Movable{

	private double enginePower; // Engine power of the car
	private double currentSpeed; // The current speed of the car
	private Color color; // Color of the car
	private String modelName; // The car model name
	
	/*
	 * Direction = 0 -> RIGHT
	 * Direction = 1 -> DOWN
	 * Direction = 2 -> LEFT
	 * Direction = 3 -> UP
	 */
	
	private double xPos;
	private double yPos;
	private int direction;

	private boolean turboOn;
	
	public void move() {
		switch(direction) {
		case 0:
			xPos += getCurrentSpeed();
			break;
		case 1:
			yPos -= getCurrentSpeed();
			break;
		case 2:
			xPos -= getCurrentSpeed();
			break;
		case 3:
			yPos += getCurrentSpeed();
			break;
		}
	}
	
	public void turnLeft() {
		direction = (direction+3)%4;
		
	}
	
	public void turnRight() {
		direction = (direction+3)%4;
	}
	
	protected Car(Color c, String m, double ep) {
		color = c;
		modelName = m;
		enginePower = ep;
		
		direction = 0;
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
		if (currentSpeed < 0) {
			currentSpeed = 0;
		}
		else if (currentSpeed > enginePower) {
			currentSpeed = enginePower;
		}
	}

	private void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
		if (currentSpeed < 0) {
			currentSpeed = 0;
		}
		else if (currentSpeed > enginePower) {
			currentSpeed = enginePower;
		}
	}

	public void gas(double amount) {
		if(amount > 0 && amount < 1) {
			incrementSpeed(amount);
		}
		else return;
	}

	public void brake(double amount) {
		if(amount > 0 && amount < 1) {
			decrementSpeed(amount);
		}
		else return;
	}
	
}
