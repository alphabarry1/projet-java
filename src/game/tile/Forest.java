package game.tile;

import game.resource.Resource;

public class Forest extends Tile {
	public Forest(int x, int y) {
		super(x,y);
	}
	
	public void produceResource(){
		this.addResource(Resource.WOOD);
	}

	@Override
	public int getPoints() {
		return 2;
	}
}
