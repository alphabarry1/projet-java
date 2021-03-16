package game.tile;

import java.util.ArrayList;
import java.util.List;

import game.character.Character;
import game.resource.Resource;

public abstract class Tile {
	private int x;
	private int y;
	private Character character;
	private List<Resource> resources;
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		this.resources = new ArrayList<Resource>();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public abstract void produceResource();

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public List<Resource> getResources() {
		return resources;
	}
	
	public void addResource(Resource resource) {
		this.resources.add(resource);
	}
}
