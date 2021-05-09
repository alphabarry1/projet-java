package game.player;

import java.util.ArrayList;
import java.util.List;
import game.character.Army;
import game.character.exception.ArmySizeException;
import game.tile.Tile;
import game.Board;

public class WarPlayer extends Player{
	private static final int GOLD_QUANTITY_DEFAULT = 15;
	private List<Army> armies;
	private int score;

	public WarPlayer(Board board, String name) {
		super(GOLD_QUANTITY_DEFAULT, board, name);
		this.armies = new ArrayList<Army>();
		this.score = 0;
	}

	@Override
	public int getScore() {
		for (Army a: this.armies)
			this.score += a.getTile().getPoints();
		
		return this.score;
	}
	
	/**
	 * increases the score
	 */
	public void increaseScore(int s) {
		this.score += s;
	}
	
		
	/**
	 * Gets the associated armies to the player
	 * @return
	 */
	public List<Army> getArmies() {
		return this.armies;
	}
	
	/**
	 * Gets food stock
	 * @return the food stock
	 */
	public int getFoodStock() {
		return 0;
	}
	
	/**
	 * Deploys an army in a tile
	 * @param n the number of warrior 
	 * @param x the abscissa of the tile position 
	 * @param y the ordinate of the tile position
	 * @throws ArmySizeException
	 */
	public void deployArmy(int n, int x, int y) throws ArmySizeException {
		Tile tile = this.getBoard().getTile(x, y);
		Army a = new Army(0, tile, this, n, 0);
		
		List<Tile> tiles = this.getBoard().getAdjacentTiles(x, y);
		tiles.add(tile);
		
		for (Tile t: tiles) {
			if (t.isOccuped()) {
				a.attack((Army) t.getCharacter());
			}
			else {
				t.setCharacter(a);
			}
		}
		a.feedArmy();
		this.armies.add(a);
	}	
}