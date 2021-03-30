package game.player;

import game.Board;
import game.character.Worker;
import game.tile.Tile;
import game.player.Player;


public class WarPlayer extends Player{
	private static final int GOLD_QUANTITY_DEFAULT = 15;

	public WarPlayer(Board board) {
		super(GOLD_QUANTITY_DEFAULT, board);
	}

	@Override
	public int getScore() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getFoodStock() {
		
		return 0;
		
	}
	public void deployArmy(int s, Tile t) {
		
	}
	
	public void payWorker(Worker worker) {
		Tile tile = worker.getTile();
		
	}
	
}