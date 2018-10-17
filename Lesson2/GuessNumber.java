import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	private int computerRandomNum;

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?");

		computerRandomNum = rand.nextInt(100) + 0;
	}

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber() == computerRandomNum) {
			return true;

		} else if (player.getNumber() < computerRandomNum) {
			System.out.println("\n" + player.getName() + "'s number is less.");
			return false;
			
		} else {
			System.out.println("\n" + player.getName() + "'s number is greater.");
			return false;
		}
	}

	public void startGame(Player player1, Player player2) {
			generateRandomNum();

			do {
				System.out.println("\n" + player1.getName() + ": enter you answer:");
				player1.setNumber(Integer.parseInt(scan.nextLine()));

				System.out.println(player2.getName() + ": enter you answer:");
				player2.setNumber(Integer.parseInt(scan.nextLine()));

			} while ( !(checkPlayerNum(player1)) && !(checkPlayerNum(player2)) );

			if (player1.getNumber() == player2.getNumber() ) {
				System.out.println("\n" + "Both players was right!");
			} else if (checkPlayerNum(player1)) {
				System.out.println("\n" + player1.getName() + " wins!");
			} else {
				System.out.println("\n" + player2.getName() + " wins!");
			}

			
	}
}