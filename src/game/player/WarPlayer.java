package game.player;

import game.Board;
import game.tile.Tile;
import game.player.Player;


public class WarPlayer extends Player{
	private int numberofGoldCoinsbydefault= 15;

	public WarPlayer(Board board) {
		super(numberofGoldCoinsbydefault,board);
		// TODO Auto-generated constructor stub	
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
	
}