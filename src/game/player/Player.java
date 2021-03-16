package game.player;

<<<<<<< HEAD
import java.util.List;

import game.character.Character;
import game.resource.Resource;

public abstract class Player {
	private int goldQuantity;
	private List<Character> characters;
	private List<Resource> resources;
	
	public Player(int goldQuantity){
		this.goldQuantity = goldQuantity;
	}
	
	public abstract int getScore();
	
	public int getGoldQuantity() {
		return this.goldQuantity;
=======
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
>>>>>>> 47014919a3c3cea126dbf1ce859897cfc4780e4e
	}
}
