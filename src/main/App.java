package main;

import controller.CarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.Saab95;
import model.Scania;
import model.Vehicle;
import model.Volvo740;
import view.ButtonBox;
import view.CarPane;

public class App extends Application {

	private final static double WIDTH = 1200;
	private final static double HEIGHT = 700;

	@Override
	public void start(Stage primaryStage) throws Exception {

		BorderPane root = new BorderPane();
		CarPane carCP = new CarPane();
		CarController carCC = new CarController(carCP);
		ButtonBox carCBP = new ButtonBox(carCC);
		
		Vehicle volvo740Model = new Volvo740();
		Vehicle scaniaModel = new Scania();
		Vehicle saabModel = new Saab95();
		
		carCC.setModel(volvo740Model);
		carCC.setModel(scaniaModel);
		carCC.setModel(saabModel);
		
		root.setTop(carCP);
		root.setBottom(carCBP);

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Car Simulator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}

}
