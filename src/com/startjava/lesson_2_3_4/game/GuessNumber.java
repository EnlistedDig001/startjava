package com.startjava.lesson_2_3_4.game;
import java.util.*;

public class GuessNumber {
	private Random rand = new Random();
	private Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private int computerRandomNumber;
	private int currentTry;
	private static final int MAX_TRIES = 10;
	private static final int FEWER_TRIES = 7;
	private static final int RAND_MAX = 1;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
        generateRandomNum();

        for (currentTry = 0; currentTry < MAX_TRIES; currentTry++) {

            if (currentTry >= FEWER_TRIES) {
                System.out.println(MAX_TRIES - currentTry + " lives left");
            }

            inputPlayerNum(player1);
            checkPlayerNum(player1);
            if (player1.isWinner()) {
                System.out.println("Player " + player1.getName() + " wins with " + (10 - currentTry) + " lives left!");
                printPlayersNums();
                break;
            }

            inputPlayerNum(player2);
            checkPlayerNum(player2);
            if (player2.isWinner()) {
                System.out.println("Player " + player2.getName() + " wins with " + (10 - currentTry) + " lives left!");
                printPlayersNums();
                break;
            }




        }
        if (currentTry == MAX_TRIES) {
            System.out.println("You have no lives left. Insert coin to continue.");
            printPlayersNums();
        }
	}

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to " + RAND_MAX + ". What number is it?");
		computerRandomNumber = rand.nextInt(RAND_MAX);
		System.out.println("Note: you have only 10 tries.");
	}

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber() == computerRandomNumber) {
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

	private void inputPlayerNum(Player player) {
        System.out.println(player.getName() + ": enter you answer:");
        player.setNumber(scan.nextInt());
    }

	private void printPlayersNums() {
        System.out.println("Player 1 & 2 answers:");
        
        for (int i = 0; i < currentTry; i++) {
        //currently not working
        }
    }


}