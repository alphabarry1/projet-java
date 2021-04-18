package game.tile;

import game.resource.Resource;

public class Plain extends Tile {
	public Plain(int x, int y) {
		super(x, y);
	}
	
	public void produceResource() {
		this.addResource(Resource.WHEAT);
	}

	@Override
	public int getPoints() {
		return 1;
	}
}
