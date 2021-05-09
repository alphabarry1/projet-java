package game.tile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import game.resource.Resource;

class ForestTest {
	@Test
	public void testProduceResource() {
		Tile tile = new Forest(11,9);
		tile.produceResource();
		assertEquals(tile.getResources().get(0), Resource.WOOD);		
	}
	@Test
	public void testGetPoint() {
		Tile tile = new Forest(11,9);
		assertEquals(tile.getPoints(), 4);
	}
	

}
