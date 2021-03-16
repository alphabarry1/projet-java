package game.character;

<<<<<<< HEAD
import game.character.exception.ArmySizeException;
=======
import java.util.ArrayList;
import java.util.List;

>>>>>>> 47014919a3c3cea126dbf1ce859897cfc4780e4e
import game.player.Player;
import game.resource.Resource;
import game.tile.Desert;
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
	
	/**
	 * Sets the army size
	 */
	public void setSize(int size) {
		this.size = size;
	}
	

	public int getFood() {
		return food;
	}
	
	/**
	 * Gets the resources in the occupied and adjacent tiles 
	 * @return the list of resources
	 */
	public List<Resource> collectResources(){
		List<Resource> resources = new ArrayList<Resource>();
		
		// Getting the resources in the current tile
		resources.addAll(this.getTile().getResources());
		
		// Getting the resources in the adjacent tiles
		List<Tile> adjacentes = this.getPlayer().getBoard().getAdjacentTiles(this.getTile());
		for (Tile tile : adjacentes) 
			resources.addAll(tile.getResources());
		
		return resources;
	}

	/**
	 * Adds one warrior on the number of warrior.
	 */
	public void addWarriors(){
		if (this.size + 1 >= ARMY_MAX_SIZE) 
			this.size = ARMY_MAX_SIZE;
		else
			this.size++;
	}
	
	/**
	 * Decreases the number of warriors by the half.
	 */
	public void removeWarriors(){
<<<<<<< HEAD
		this.size = this.size/2;
=======
		this.size -= (this.size / 2);
	}
	
	/**
	 * Transforms resources in feed
	 */
	public void transformResouces() {
		List<Resource> resources = this.collectResources();
		
		for (Resource resource : resources) {
			if (resource == Resource.WOOD)
				this.food++;
			else if (resource == Resource.WHEAT)
				this.food += 5;
		}
>>>>>>> 47014919a3c3cea126dbf1ce859897cfc4780e4e
	}
	
	/**
	 * Feeds the army
	 */
	public void feedArmy(){
		Tile tile = this.getTile();
		
		this.transformResouces();
		
		if (tile instanceof Desert)
			this.food -= this.size*2;	
		else
			this.food -= this.size;
		
		// if the quantity of food in under 0
		if (this.food < 0) {
			this.increaseGoldQuantity(1);
			this.size = 0;
			// army loses the tile
			this.setTile(null);
		}
	}
	
	/**
	 * Attacks an army.
	 * 
	 * @param a the army to attack.
	 */
	public void attack(Army a){
		if (a.getSize() < this.size && this.getPlayer() != a.getPlayer()){
			a.setSize(a.getSize() / 2);
			
			if (a.getSize() < 1) {
				a.changePlayer(this.getPlayer());
				this.increaseGoldQuantity(2);
			}
		}
		else if  (a.getSize() < this.size && this.getPlayer() == a.getPlayer()){
			a.addWarriors();
			this.increaseGoldQuantity(1);
		}
	}
<<<<<<< HEAD
	
	public void attack(Army a){
		
	}
=======
>>>>>>> 47014919a3c3cea126dbf1ce859897cfc4780e4e
	
}
