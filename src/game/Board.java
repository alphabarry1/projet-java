package game;

import java.util.ArrayList;
import java.util.List;
import game.tile.Tile;

public class Board {
	private int width;
	private int height;
	private Tile[][] tiles;
	
	public Board(int width, int height) {
		this.width = width;
		this.height = height;
		this.init(width, height);
	}

	/**
	*
	*/
	public void init(int width, int height){
		this.tiles = new Tile[height][width];
		int nTilesOcean = 0;
		for(int i=0; i<height; i++){
			for(int j=0; j<width; j++){
			
			}
		}

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
	
	/**
	 * Gets a tile at the position x and y passed as parameter.
	 * 
	 * @param x the abscissa
	 * @param y the ordinate  
	 */
	public Tile getTile(int x, int y) {
		return tiles[x][y];
	}
	
	/**
	 * Gets the adjacent tiles
	 * 
	 * @param tile the tile whom to get its adjacent
	 * @return list of tile
	 */
	public List<Tile> getAdjacentTiles(Tile tile){
		int x = tile.getX();
		int y = tile.getY();
		
		// initialize the list of result tiles
		List<Tile> tiles = new ArrayList<Tile>();
		
		if (x-1 >= 0) {
			tiles.add(this.getTile(x-1, y));
		}
		if (x+1 <= this.width-1) {
			tiles.add(this.getTile(x+1, y));
		}
		if (y-1 >= 0) {
			tiles.add(this.getTile(x, y-1));
		}
		if (y+1 <= this.height-1) {
			tiles.add(this.getTile(x, y+1));
		}
		
		return tiles;
	}
}
