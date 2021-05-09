package game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import game.character.Army;
import game.player.Player;
import game.player.WarPlayer;
import game.tile.Ocean;

public class Game {
	private List<Player> players;
	private int turns;
	private Map<String, Integer> score;
	
	public Game(int turns) {
		this.turns = turns;
		this.players = new ArrayList<Player>();
		this.score = new HashMap<String, Integer>();
	}
	
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	
	public void play() {
		int i = 0;
		while(i < this.turns) {
			System.out.println("--------------------- TOUR "+(i+1)+" -------------------");
			for(Player player: players) {
				boolean choosed = false;
				Scanner scan = new Scanner(System.in);
				while (!choosed) {
					System.out.println("Au tour du joueur " + player.getName());
					System.out.println("Choisir une action : ");
					System.out.println("1 - Déployer une armée");
					System.out.println("2 - Passer son tour");
					
					int choice = scan.nextInt();
					
					switch (choice) {
					case 1:
						choosed = true;
						boolean canMove = false;
						int n;
						int x = 0;
						int y = 0;
						System.out.println("Vous avez choisi de déployer une armée");
						
						do {
							System.out.println("Indiquer le nombre de guerriers à déployer (1-5)");
							n = scan.nextInt();
						} while (n < 1 || n > 5);
						
						while(!canMove) {
							do {
								System.out.println("Donner la position X (0-9)");
								x = scan.nextInt();
							} while (x < 0 || x > 9);
							
							do {
								System.out.println("Donner la position Y (0-9)");
								y = scan.nextInt();
							} while (y < 0 || y > 9);
							
							if (player.getBoard().getTile(x, y) instanceof Ocean) {
								System.out.println("Vous ne pouvez pas vous déployer sur une tuile Océan");
							}
							else {
								canMove = true;
							}
						}

						try {
							((WarPlayer) player).deployArmy(n, x, y);
						}
						catch(Exception e) {}
						
						break;
					case 2:
						choosed = true;
						System.out.println("Vous avez choisi de passer votre tour");
						break;
					default:
					}
				}
			}
			i++;
		}
	}
	
	/**
	 * Calculates the total score
	 */
	public void getScore() {
		for (Player player: players) {
			int cpt  = 0;
			for (Army army : ((WarPlayer) player).getArmies()) {
				cpt += army.getGoldQuantity();
				if (army.getTile() != null)
					cpt += army.getTile().getPoints();
			}
			score.put(player.getName(), cpt);
		}
	}
	
	/**
	 * Displays the winner name
	 */
	public void displayWinner() {
		this.getScore();
		String winner = "";
		int ref = 0;
		
		for (String name: score.keySet()) {
			System.out.println(name + " " + score.get(name));
			if (score.get(name) > ref) {
				ref = score.get(name);
				winner = name;
			}
		}
		
		System.out.print("Le gagnant est : "+winner);
	}
}
