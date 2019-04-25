package model;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moveTest {

	Volvo740 volvo = new Volvo740();

	@Test
	public void volvoGasAndBrakeTest() {
		
		//F�rv�ntad hastighet �r 0, h�mtar hastigheten 0.
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		//Gasar med 1 (0 < gas <= 1).
		volvo.gas(1);
		//F�rv�ntad hastighet �r 1.25, h�mtar hastigheten 1.25.
		assertEquals(1.25, volvo.getCurrentSpeed(), 0);
		
		//F�rv�ntad position X �r 0, h�mtar positionen 0.
		assertEquals(0, volvo.getX(), 0);
		//F�rflyttar bilen med hastigheten x (1.25 i detta fall).
		volvo.move();
		//F�rv�ntad position X �r 1.25, h�mtar positionen 1.25.
		assertEquals(1.25, volvo.getX(), 0);
		volvo.turnRight();
		//F�rflyttar bilen med en hastighet i positionen x (1.25 i detta fall).
		volvo.move();
		//F�rflyttar bilen med hastigheten x (1.25 i detta fall).
		volvo.move();
		volvo.turnLeft();
		volvo.move();
		//F�rv�ntad position X �r 2.5, h�mtar positionen 2.5.
		assertEquals(2.5, volvo.getX(), 0);
		//F�rv�ntad position X �r 2.5, h�mtar positionen 2.5.
		assertEquals(2.5, volvo.getY(), 0);

		
	}
	
	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setX(0);
		volvo.setY(0);
	}

}