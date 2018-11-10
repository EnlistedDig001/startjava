package com.startjava.lesson_2_3_4.game;
import java.util.*;

public class GuessNumber {
	private Random rand = new Random();
	private Scanner scan = new Scanner(System.in);
	private Player player1, player2;
	private int computerRandomNumber, currentTry;
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
            if (checkPlayerNum(player1)) {
                break;
            }

            inputPlayerNum(player2);
            if (checkPlayerNum(player2)) {
            	break;
			}

        }
        if (currentTry >= MAX_TRIES) {
            System.out.println("You have no lives left. Insert coin to continue.");
            currentTry--;
            printPlayersNums();
        }
	}

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to " + RAND_MAX + ". What number is it?");
		computerRandomNumber = rand.nextInt(RAND_MAX);
		System.out.println("Note: you have only 10 tries.");
	}

	private void inputPlayerNum(Player player) {
        System.out.println(player.getName() + ": enter you answer:");
        player.setNumber(scan.nextInt());
    }

    private void printPlayersNums() {
        System.out.println("Player 1 & 2 answers: ");
        currentTry--;
        for (int i = 0; i <= currentTry; i++) {
            System.out.println(player1.getNumberWithIndex(i) + " " + player2.getNumberWithIndex(i));
        }

        System.out.print(player1.getNumber() + " ");
        if (!player1.isWinner()) {
            System.out.println(player2.getNumber());
        }

        player1.reset();
        player2.reset();
    }

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber() == computerRandomNumber) {
            player.setWinner(true);
		    System.out.println("Player " + player.getName() + " wins with " + (10 - currentTry) + " lives left! \n");
            printPlayersNums();
		    return true;
		} else if (player.getNumber() < computerRandomNumber) {
		    System.out.println(player.getName() + "'s number is less. \n");
		    return false;
		} else {
		    System.out.println(player.getName() + "'s number is greater. \n");
		    return false;
		}
	}
}