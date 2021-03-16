package game.character;

import game.tile.Tile;

import java.util.List;

import game.player.Player;
import game.resource.Resource;

public abstract class Character {
	private int goldQuantity;
	private Tile tile;
	private Player player;
	
	
	public Character(int goldQuantity, Tile tile, Player player) {
		this.goldQuantity = goldQuantity;
		this.tile = tile;
		this.player = player;
	}
	
	public abstract List<Resource> collectResources();

	public int getGoldQuantity() {
		return goldQuantity;
	}
	
	/**
	 * Increases the gold quantity by the value passed as parameter
	 * @param quantity the quantity to increase
	 */
	public void increaseGoldQuantity(int quantity) {
		this.goldQuantity += quantity;
	}

	public Tile getTile() {
		return tile;
	}


	public void setTile(Tile tile) {
		this.tile = tile;
	}

	public Player getPlayer() {
		return player;
	}


	public void changePlayer(Player player) {
		this.player = player;
	}
	
	
}
