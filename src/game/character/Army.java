package game.character;

import game.player.Player;
import game.resource.Resource;
import game.tile.Tile;

public class Army extends Character{
	private int size;
	private int food;
	
	public static int ARMY_MIN_SIZE = 1;
	public static int ARMY_MAX_SIZE = 5;
	
	public Army(int goldQuantity, Tile tile, Player player, int size, int food) {
		super(goldQuantity, tile, player);
		this.size = size;
		this.food = food;
	}
	
	public int getSize() {
		return size;
	}
	

	public int getFood() {
		return food;
	}
	
	public Resource collectResource(){
		return null;
	}

	public void addWarriors(){
		
	}
	
	public void removeWarriors(){
		
	}
	
	public void feedArmy(){
		
	}
	public void attack(Army a){}
	
}
