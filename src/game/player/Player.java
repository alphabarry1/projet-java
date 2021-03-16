package game.player;

import game.Board;

public abstract class Player {
	private Board board; 
	
	
	public Player(Board board){
		this.board = board;
	}
	
	
	/**
	 * Gets the board of tiles.
	 * @return the board.
	 */
	public Board getBoard() {
		return this.board;
	}
}
