

import game.Board;
import game.Game;
import game.player.WarPlayer;

public class WarriorMain {
	
	public static void main(String[] args) {
		System.out.println("Initialisation du jeu");
		Board board = new Board(10, 10);
		board.init();
		
		Game game = new Game(10);

		for(String name: args) {
			WarPlayer player = new WarPlayer(board, name);
			game.addPlayer(player);
		}
		System.out.println("Initialisation terminée");
		
		game.play();
		game.displayWinner();
	}
}