package game.character;

import game.character.exception.ArmySizeException;
import game.player.Player;
import game.resource.Resource;
import game.tile.Tile;

public class Army extends Character{
	private int size;
	private int food;
	
	public static int ARMY_MIN_SIZE = 1;
	public static int ARMY_MAX_SIZE = 5;
	
	public Army(int goldQuantity, Tile tile, Player player, int size, int food) throws ArmySizeException{
		super(goldQuantity, tile, player);
		this.food = food;
		if(size >= ARMY_MIN_SIZE && size <= ARMY_MAX_SIZE) {
			this.size = size;
		}else {
			throw new ArmySizeException("Size of the army is between 1 and 5");
		}
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
		this.size = this.size/2;
	}
	
	public void feedArmy(){
		
	}
	
	public void attack(Army a){
		
	}
	
}
