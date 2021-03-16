package game.player;

import game.Board;

public class AgriculturePlayer extends Player{

	public AgriculturePlayer(int goldQuantity, Board board) {
		super(goldQuantity, board);
	}

	public int getScore() {
		return 0;
	}
	
}