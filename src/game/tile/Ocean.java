package game.tile;

public class Ocean extends Tile{
	public Ocean(int x, int y) {
		super(x, y);
	}
	
	public void produceResource() {}

	@Override
	public int getPoints() {
		return 0;
	}
}
