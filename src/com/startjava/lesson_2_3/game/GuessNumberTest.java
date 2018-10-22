package com.startjava.lesson_2_3.game;
import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userAnswer;

		System.out.println("\n" + "Enter first player name:");
		Player player1 = new Player(scan.nextLine());	

		System.out.println("Enter second player name:");
		Player player2 = new Player(scan.nextLine());	

		GuessNumber guessNumber = new GuessNumber(player1, player2);

		do {
			guessNumber.startGame();
			
			do {
				System.out.println("\n" + "Do you want to start over ? y/n");
				userAnswer = scan.nextLine();

			} while (!userAnswer.equals("y") && !userAnswer.equals("n")); 
		} while (userAnswer.equals("y"));
	}
}