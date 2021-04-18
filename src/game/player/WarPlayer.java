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

	public WarPlayer(Board board) {
		super(GOLD_QUANTITY_DEFAULT, board);
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
	
	public int getFoodStock() {
		return 0;
	}
	
	public void deployArmy(int n, int x, int y) throws ArmySizeException {
		Tile tile = this.getBoard().getTile(x, y);
		Army a = new Army(0, tile, this, n, 0);
		this.armies.add(a);
	}	
}