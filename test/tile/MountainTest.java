package game.tile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.resource.Resource;

class MountainTest {
	
	@Test
	public void testProduceResource() {
		Tile tile = new Mountain(10,5);
		tile.produceResource();
		assertEquals(tile.getResources().get(0), Resource.WHEAT);		
	}
	
	@Test
	public void testGetPoint() {
		Tile tile = new Mountain(10,5);
		assertEquals(tile.getPoints(), 4);
	}

}
