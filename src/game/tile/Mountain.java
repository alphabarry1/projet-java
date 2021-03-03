package game.tile;

import game.resource.Resource;

public class Mountain extends Tile {
	public Mountain(int x, int y) {
		super(x,y);
	}
	
	public void produceResource(){
		this.addResource(Resource.WHEAT);
	}
}
