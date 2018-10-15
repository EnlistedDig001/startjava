import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);
	String goToNextLine = System.getProperty("line.separator");
	private int computerRandomNum;

	private void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?");

		computerRandomNum = rand.nextInt(100) + 0;
	}

	private boolean checkPlayerNum(Player player) {
		if (player.getNumber() == computerRandomNum) {
			return true;

		} else if (player.getNumber() < computerRandomNum) {
			System.out.println(goToNextLine + player.getName() + "'s number is less.");
			return false;
			
		} else {
			System.out.println(goToNextLine + player.getName() + "'s number is greater.");
			return false;
		}
	}

	public void startGame() {
		System.out.println(goToNextLine + "Enter first player name:");
			Player player1 = new Player(scan.nextLine());

			System.out.println("Enter second player name:");
			Player player2 = new Player(scan.nextLine());

			generateRandomNum();

			do {
				System.out.println(goToNextLine + player1.getName() + ": enter you answer:");
				player1.setNumber(Integer.parseInt(scan.nextLine()));

				System.out.println(player2.getName() + ": enter you answer:");
				player2.setNumber(Integer.parseInt(scan.nextLine()));

			} while ( !(checkPlayerNum(player1)) && !(checkPlayerNum(player2)) );

			if (player1.getNumber() == player2.getNumber() ) {
				System.out.println(goToNextLine + "Both players was right!");
			} else if (checkPlayerNum(player1)) {
				System.out.println(goToNextLine + player1.getName() + " wins!");
			} else {
				System.out.println(goToNextLine + player2.getName() + " wins!");
			}

			
	}
}