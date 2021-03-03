package game.tile;

import game.resource.Resource;

public class Desert extends Tile {
	public Desert(int x, int y) {
		super(x, y);
	}
	
	public void produceResource(){
		this.addResource(Resource.SAND);
	}
}
