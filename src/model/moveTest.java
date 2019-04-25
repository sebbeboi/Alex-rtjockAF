package model;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moveTest {

	Volvo740 volvo = new Volvo740();

	@Test
	public void volvoGasAndBrakeTest() {
		
		//Förväntad hastighet är 0, hämtar hastigheten 0.
		assertEquals(0, volvo.getCurrentSpeed(), 0);
		//Gasar med 1 (0 < gas <= 1).
		volvo.gas(1);
		//Förväntad hastighet är 1.25, hämtar hastigheten 1.25.
		assertEquals(1.25, volvo.getCurrentSpeed(), 0);
		
		//Förväntad position X är 0, hämtar positionen 0.
		assertEquals(0, volvo.getX(), 0);
		//Förflyttar bilen med hastigheten x (1.25 i detta fall).
		volvo.move();
		//Förväntad position X är 1.25, hämtar positionen 1.25.
		assertEquals(1.25, volvo.getX(), 0);
		volvo.turnRight();
		//Förflyttar bilen med en hastighet i positionen x (1.25 i detta fall).
		volvo.move();
		//Förflyttar bilen med hastigheten x (1.25 i detta fall).
		volvo.move();
		volvo.turnLeft();
		volvo.move();
		//Förväntad position X är 2.5, hämtar positionen 2.5.
		assertEquals(2.5, volvo.getX(), 0);
		//Förväntad position X är 2.5, hämtar positionen 2.5.
		assertEquals(2.5, volvo.getY(), 0);

		
	}
	
	@BeforeEach
	public void resetVolvo() {
		volvo.stopEngine();
		volvo.setX(0);
		volvo.setY(0);
	}

}