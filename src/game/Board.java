package game;

import game.tile.Tile;

public class Board {
	private int width;
	private int height;
	private Tile[][] tiles;
	
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.tiles = new Tile[height][width];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Tile[][] getTiles() {
		return tiles;
	}
}
