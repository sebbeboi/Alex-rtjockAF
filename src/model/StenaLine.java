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
	
	public void LastaP�(Car c) {
		if(lastareFil1.antal() < 20) {
			lastareFil1.lastaP�(c);
		}
		else if(lastareFil2.antal() < 20) {
			lastareFil2.lastaP�(c);
		}
		else if(lastareFil3.antal() < 20) {
			lastareFil3.lastaP�(c);
		}
		else {
			return;
		}
	}
	
	public void LastaAvF�rsta() {
		if(lastareFil1.antal() > 0) {
			lastareFil1.lastaAvF�rsta();
		}
		else if(lastareFil2.antal() > 0) {
			lastareFil2.lastaAvF�rsta();
		}
		else if(lastareFil3.antal() > 0) {
			lastareFil3.lastaAvF�rsta();
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
