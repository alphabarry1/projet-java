package game.tile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.character.Army;
import game.character.exception.ArmySizeException;
import game.resource.Resource;

class DesertTest {
	
	@Test
	void getXTest() {
		Desert desert = new Desert(1, 2);
		assertEquals(desert.getX(), 1);
	}

	@Test
	void getYTest() {
		Desert desert = new Desert(1, 2);
		assertEquals(desert.getY(), 2);
	}
	
	@Test
	void getPointsTest() {
		Desert desert = new Desert(1, 2);
		
		assertEquals(4, desert.getPoints());
		assertNotEquals(2, desert.getPoints());
	}

	@Test
	void produceResourceTest1() {
		Desert desert = new Desert(0, 0);
		
		assertTrue(desert.getResources().size() == 0);
		
		desert.produceResource();
		
		assertFalse(desert.getResources().size() == 0);
	}
	
	@Test
	void produceResourceTest2() {
		Desert desert = new Desert(0, 0);
		
		desert.produceResource();
		desert.produceResource();
		desert.produceResource();
		
		assertTrue(desert.getResources().size() == 3);
		
		for (Resource r: desert.getResources()) {
			assertEquals(r, Resource.SAND);
		}
	}
	
	@Test
	void getNeededFoodTest() throws ArmySizeException {
		Desert desert = new Desert(0, 0);
		
		int size = 3;
		Army a = new Army(0, null, null, size, 0);
		desert.setCharacter(a);
		
		assertNotEquals(size, desert.getNeededFood());
		assertEquals(2 * size, desert.getNeededFood());
	}
	
	@Test
	void getCharacterTest() throws ArmySizeException {
		Desert desert = new Desert(0, 0);
		
		Army a = new Army(1, null, null, 2, 3);
		desert.setCharacter(a);
		
		assertEquals(a, desert.getCharacter());
	}
}
