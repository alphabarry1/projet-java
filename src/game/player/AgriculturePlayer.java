package game.player;

import game.Board;

public class AgriculturePlayer extends Player{

	public AgriculturePlayer(int goldQuantity, Board board, String name) {
		super(goldQuantity, board, name);
	}

	public int getScore() {
		return 0;
	}
	
}