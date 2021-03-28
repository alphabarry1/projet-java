package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import game.tile.Desert;
import game.tile.Forest;
import game.tile.Mountain;
import game.tile.Ocean;
import game.tile.Plain;
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
	* Initializes the board tiles.
	*/
	public void init(int width, int height){
		this.tiles = new Tile[height][width];
		int nTilesOcean = 0;
		for(int x=0; x<height; x++){
			for(int y=0; y<width; y++){
				Random random = new Random();
				int rand = random.nextInt(5 - 1 + 1) + 1;
				
				switch(rand) {
				case 1 :
					this.tiles[x][y] = new Ocean(x, y);
					nTilesOcean++;
					break;
				case 2 :
					this.tiles[x][y] = new Mountain(x, y);
					break;
				case 3 :
					this.tiles[x][y] = new Plain(x, y);
					break;
				case 4 :
					this.tiles[x][y] = new Forest(x, y);
					break;
				case 5 :
					this.tiles[x][y] = new Desert(x, y);
					break;		
				}
				
				if (this.tiles[x][y] instanceof Ocean) {
					if (x-1 >= 0) {
						this.tiles[x-1][y] = new Ocean(x-1, y);
						nTilesOcean++;
					}
					if (x+1 <= this.width-1) {
						this.tiles[x+1][y] = new Ocean(x+1, y);
						nTilesOcean++;
					}
					if (y-1 >= 0) {
						this.tiles[x][y-1] = new Ocean(x, y-1);
						nTilesOcean++;
					}
					if (y+1 <= this.height-1) {
						this.tiles[x][y+1] = new Ocean(x, y+1);
						nTilesOcean++;
					}
				}
			}
		}
		if (nTilesOcean < ((width * height * 2) / 3)) {
			this.init(width, height);
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
