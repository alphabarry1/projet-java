package game.character;

import java.util.List;

import game.player.Player;
import game.resource.Resource;
import game.tile.Tile;

public class Worker extends Character{
	private int goldQuantity=0;
	private int salaryGold;
	public Worker(int goldQuantity, Tile tile, Player player) {
		super(goldQuantity, tile, player);
	}
	
	public List<Resource> collectResources() {
		return null;
	}
	public void account(int nbGold) {
		this.salaryGold +=nbGold;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}
}
