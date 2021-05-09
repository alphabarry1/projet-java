package game.player;

import java.util.List;

import game.character.Character;
import game.resource.Resource;
import game.Board;


public abstract class Player {
	private int goldQuantity;
	private List<Character> characters;
	private List<Resource> resources;
	private Board board;
	private String name;
	
	public Player(int goldQuantity, Board board, String name){
		this.goldQuantity = goldQuantity;
		this.board = board;
		this.name = name;
	}
	
	public abstract int getScore();
	
	public int getGoldQuantity() {
		return this.goldQuantity;
	}
	
	/**
	 * Gets player name
	 */
	public String getName(){ 
		return this.name;
	}
	
	/**
	 * Sets player name
	 * @param name the player name
	 */
	public void SetName(String name) {
		this.name = name;
	}
	
	/**
	 * Gets the board of tiles.
	 * @return the board.
	 */
	public Board getBoard() {
		return this.board;
	}
	
	public List<Character> getCharacters(){
		return this.characters;
	}
	
	public List<Resource> getResources(){
		return this.resources;
	}
}
