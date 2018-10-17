import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	Player player1 = new Player();
	Player player2 = new Player();
	private int computerRandomNum;
	private byte winnerNumber;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void startGame() {
			generateRandomNum();

			do {
				winnerNumber = 0;

				System.out.println("\n" + player1.getName() + ": enter you answer:");
				player1.setNumber(scan.nextInt());

				System.out.println(player2.getName() + ": enter you answer:");
				player2.setNumber(scan.nextInt());

				if (checkPlayerNum(player1)) {
					winnerNumber = 1;
				} else if (checkPlayerNum(player2)) {
					winnerNumber = 2;
				}

			} while (winnerNumber == 0);

			if (player1.getNumber() == player2.getNumber() ) {
				System.out.println("\n" + "Both players was right!");
			} else if (winnerNumber == 1) {
				System.out.println("\n" + player1.getName() + " wins!");
			} else {
				System.out.println("\n" + player2.getName() + " wins!");
			}

			
	}

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?");

		computerRandomNum = rand.nextInt(100);
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


}