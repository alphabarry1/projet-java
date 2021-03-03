package game.character;

import game.player.Player;
import game.resource.Resource;
import game.tile.Tile;

public class Worker extends Character{
	public Worker(int goldQuantity, Tile tile, Player player) {
		super(goldQuantity, tile, player);
	}
	
	public Resource collectResource() {
		return null;
	}
}
