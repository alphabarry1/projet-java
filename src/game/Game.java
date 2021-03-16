package game;

import java.util.List;

import game.player.Player;

public class Game {
	private List<Player> players;
	private Board board;
	private int turns;
	
	public Game(Board board, int turns) {
		this.board = board;
		this.turns = turns;
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void play(){
		while(this.turns > 0) {
			for(int i=0; i<this.players.size(); i++) {
				// Time for a player to play
				System.out.print("");
			}			
			this.turns--;
		}
	}
	
	public Player getPlayer(int i){
		return this.players.get(i);
	}
}
