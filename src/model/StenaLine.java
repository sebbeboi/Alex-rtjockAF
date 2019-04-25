package model;
import javafx.scene.paint.Color;

public class StenaLine extends Vehicle {
	public StenaLine() {
		super(Color.WHITE,"StenaLine",40000);
		stopEngine();
	}
	
	Lastare lastareFil1 = new Lastare(20);
	Lastare lastareFil2 = new Lastare(20);
	Lastare lastareFil3 = new Lastare(20);
	
	public void LastaPå(Car c) {
		if(lastareFil1.antal() < 20) {
			lastareFil1.lastaPå(c);
		}
		else if(lastareFil2.antal() < 20) {
			lastareFil2.lastaPå(c);
		}
		else if(lastareFil3.antal() < 20) {
			lastareFil3.lastaPå(c);
		}
		else {
			return;
		}
	}
	
	public void LastaAvFörsta() {
		if(lastareFil1.antal() > 0) {
			lastareFil1.lastaAvFörsta();
		}
		else if(lastareFil2.antal() > 0) {
			lastareFil2.lastaAvFörsta();
		}
		else if(lastareFil3.antal() > 0) {
			lastareFil3.lastaAvFörsta();
		}
		else {
			return;
		}
	}
	
	@Override
	public void move() {
		super.move();
		lastareFil1.updateAllPositions(this);
		lastareFil2.updateAllPositions(this);
		lastareFil3.updateAllPositions(this);
	}
}
