package game.player;

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
	}
}
