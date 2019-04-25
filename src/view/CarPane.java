package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView volvoImage;
	private ImageView saabImage;
	private ImageView scaniaImage;

	private double volvoXPOS;
	private double volvoYPOS = 100;

	private double scaniaXPOS;
	private double scaniaYPOS = 200;

	private double saabXPOS;
	private double saabYPOS = 300;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		
		this.getChildren().addAll(volvoImage, scaniaImage, saabImage);
	}

	public void move(String model, double x, double y) {
		if(model.equals("Volvo740")) {
			volvoXPOS = x;
			volvoYPOS = y;
		}
		if(model.equals("Saab95")) {
			saabXPOS = x;
			saabYPOS = y;
		}
		if(model.equals("Scania")) {
			scaniaXPOS = x;
			scaniaYPOS = y;
		}
	}

	public void update() {
		volvoImage.setX(volvoXPOS);
		volvoImage.setTranslateY(volvoYPOS);
		
		scaniaImage.setX(scaniaXPOS);
		scaniaImage.setTranslateY(scaniaYPOS);
		
		saabImage.setX(saabXPOS);
		saabImage.setTranslateY(saabYPOS);
	}

}
