import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private Random rand = new Random();
	private Scanner scan = new Scanner(System.in);
	private Player player1;
	private Player player2;
	private int computerRandomNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
		generateRandomNum();

		do {
			System.out.println("\n" + player1.getName() + ": enter you answer:");
			player1.setNumber(scan.nextInt());

			System.out.println(player2.getName() + ": enter you answer:");
			player2.setNumber(scan.nextInt());

		} while (!player1.isWinner() && !player2.isWinner());

		if (player1.getNumber() == player2.getNumber()) {
			System.out.println("\n" + "Both players was right!");
		} else if (player1.isWinner()) {
			System.out.println("\n" + player1.getName() + " wins!");
		} else {
			System.out.println("\n" + player2.getName() + " wins!");
		}
	}

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?");
		computerRandomNumber = rand.nextInt(100);
	}

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber() == computerRandomNumber) {
			player.setWinner(true);
			return true;

		} else if (player.getNumber() < computerRandomNumber) {
			System.out.println("\n" + player.getName() + "'s number is less.");
			return false;
			
		} else {
			System.out.println("\n" + player.getName() + "'s number is greater.");
			return false;
		}
	}


}