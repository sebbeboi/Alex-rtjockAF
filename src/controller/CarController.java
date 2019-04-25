package controller;

import javafx.animation.AnimationTimer;
import model.Vehicle;
import view.CarPane;

public class CarController {

	private Vehicle model;
	private int carWidth = 100;
	private int carHeight = 60;

	public CarController(CarPane cp) {

		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if (model != null) {
					model.move();
					cp.move(model.getModelName(), model.getX(), model.getY());
					cp.update();
				}
				
				if (model.getX() > 1200 - carWidth ) {
					model.turnRight();
					model.turnRight();
				}
				
				if (model.getX() < 0) {
					model.turnRight();
					model.turnRight();
				}
				
				if (model.getY() < 0) {
					model.turnRight();
					model.turnRight();
				}
				
				if (model.getY() > 700 - carHeight) {
					model.turnRight();
					model.turnRight();
				}
			}
			
		};
		at.start();
	}

	public void setModel(Vehicle v) {
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}

	public void brake(double amount) {
		model.brake(amount);
	}

}
