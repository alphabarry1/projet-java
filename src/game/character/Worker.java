package game.character;

import java.util.List;

import game.player.Player;
import game.resource.Resource;
import game.tile.Tile;

public class Worker extends Character{
	public Worker(int goldQuantity, Tile tile, Player player) {
		super(goldQuantity, tile, player);
	}
	
	public List<Resource> collectResources() {
		return null;
	}
}
