import javafx.scene.paint.Color;

public abstract class Saab95 extends Car {
	
	private Saab95() {
		super(Color.BLACK,"Saab95",125);
		stopEngine();
	}

}