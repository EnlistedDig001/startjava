package com.startjava.lesson_2_3_4.game;
import java.util.*;

public class GuessNumber {
	private Random rand = new Random();
	private Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private int computerRandomNumber;
	private int currentTry;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
        generateRandomNum();

        for (currentTry = 0; currentTry < 10 ; currentTry++) {

            if (currentTry >= 7) {
                System.out.println(10-currentTry + " lives left");
            }

            System.out.println(player1.getName() + ": enter you answer:");
            player1.setNumber(scan.nextInt());

            System.out.println(player2.getName() + ": enter you answer:");
            player2.setNumber(scan.nextInt());

            checkPlayerNum(player1);
            checkPlayerNum(player2);

            if (player1.isWinner() || player2.isWinner()) {
                break;
            }
        }

		if (player1.isWinner() && player2.isWinner()) {
			System.out.println("Both players was right!");
		} else if (player1.isWinner()) {
			System.out.println("Player " + player1.getName() + " wins with " + (10 - currentTry) + " lives left!");
		} else if (player2.isWinner()) {
			System.out.println("Player " + player2.getName() + " wins with " + (10 - currentTry) + " lives left!");
		} else {
		    System.out.println("You have no lives left. Insert coin to continue.");
        }

        printPlayersAnswers();

	}

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?");
		computerRandomNumber = rand.nextInt(100);

		System.out.println("Note: you have only 10 tries.");
	}

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber()  == computerRandomNumber) {
			player.setWinner(true);
			return true;

		} else if (player.getNumber() < computerRandomNumber) {
			System.out.println(player.getName() + "'s number is less.");
			return false;
			
		} else {
			System.out.println(player.getName() + "'s number is greater.");
			return false;
		}
	}

	private void printPlayersAnswers() {
        System.out.println("Player 1 & 2 answers:");
        for (int i = 1; i <= (currentTry) ; i++) {
            System.out.println(player1.getNumbersHistoryElemet(i) + " " + player2.getNumbersHistoryElemet(i));
        }
    }


}