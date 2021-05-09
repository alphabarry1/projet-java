package game.tile;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OceanTest {

	@Test
	public void testGetPoint() {
		Tile tile = new Ocean(10,5);
		assertEquals(tile.getPoints(), 0);
	}

}
