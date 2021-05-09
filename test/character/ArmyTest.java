package game.character;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import game.Board;
import game.character.exception.ArmySizeException;
import game.player.AgriculturePlayer;


class ArmyTest {
	

	@Test
	void getFoodtest() throws ArmySizeException  {
	
		
		Army army = new Army(2,null,null,2,10);
			assertEquals(10, army.getFood());
		
		
	}
	@Test
	void addWarriorstest() throws ArmySizeException  {
	
		
		Army army = new Army(2,null,null,2,10);
		assertEquals(2, army.getSize());
		army.addWarriors();
		assertEquals(3, army.getSize());
		
	}
	@Test
	void getSizetest() throws ArmySizeException  {
	
		
		Army army = new Army(2,null,null,2,10);
			assertEquals(2, army.getSize());
		
	}
	@Test
	void setSizetest() throws ArmySizeException  {
	
		Army army = new Army(2,null,null,2,10);
		army.setSize(3);
		assertEquals(3, army.getSize());
		
		
	}
	
}
