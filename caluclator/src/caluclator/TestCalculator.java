package caluclator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {
	Calculator calucaltor=new Calculator();

	@Test
	void  findMaxTest1Method() {
		assertEquals(8, calucaltor.findMax(3, 5, 8));
	}
	
	@Test
	void  findMaxTest2Method() {
		assertEquals(3, calucaltor.findMax(-3, -6, 3));
	}
	
	@Test
	void  findMaxTest3Method() {
		assertEquals(1, calucaltor.findMax(1, 0, -1));
	}
	
	
	@Test
	void squareTest1Method() {
		assertEquals(15, calucaltor.square(8));
	}
	
	@Test
	void squreTest2Method() {
		assertEquals(16, calucaltor.square(4));
	}
	
	@Test
	void squreTest3Method() {
		assertEquals(49, calucaltor.square(7));
	}
	
	@Test
	void cubeTest1Method() {
		assertEquals(27, calucaltor.cube(3));
	}
	
	
	@Test
	void cubeTest2Method() {
		assertEquals(125, calucaltor.cube(5));
		}
	
	
	@Test
	void cubeTest3Method() {
		assertEquals(145214, calucaltor.cube(41));
		}
	
	
	
}
