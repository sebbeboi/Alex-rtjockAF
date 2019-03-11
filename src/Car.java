import javafx.scene.paint.Color;

public abstract class Car extends Vehicle{
	
	/*
	 * Direction = 0 -> RIGHT
	 * Direction = 1 -> DOWN
	 * Direction = 2 -> LEFT
	 * Direction = 3 -> UP
	 */
	
	protected Car(Color c, String m, double ep) {
		super(c,m,ep);
	}
	
}