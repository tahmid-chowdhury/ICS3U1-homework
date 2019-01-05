/*
 * TicTacToe Game Class
 * Tahmid Chowdhury
 * 01/05/2019
 * 
 */

import TicTacToe.resources;
import java.util.Scanner;

public class start {

	public static void main(String[] args) {
		// Create game and initialize it.
		// First player will be 'x'
		resources game = new resources();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 1;

		while (c <= 9) {
			// Ask the user for a row and column to place a mark
			System.out.println("Which row would you like to mark in?: ");
			a = sc.nextInt();
			System.out.println("Which column would you like to mark in?: ");
			b = sc.nextInt();

			// Player places a mark in the desired row and column respectively
			game.placeMark((a - 1), (b - 1));

			// Prints the board
			game.printBoard();

			// Checks for a winner
			if (game.checkForWin()) {
				System.out.println("We have a winner! Congrats!");
				System.exit(0);
			}
			else if (game.isBoardFull()) {
				System.out.println("Appears we have a draw!");
				System.exit(0);
			}
			// If there is no winner or it's a draw, switch players to 'o'
			game.changePlayer();
			
			// Repeat steps again for placing mark and checking game status...
			c++;
		}
		sc.close();
	}
}
