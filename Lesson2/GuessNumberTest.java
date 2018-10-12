import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		guessNumber = new GuessNumber();

		do {
			System.out.println("Enter first player name:");
			Player player1 = new Player(scan.nextLine());

			System.out.println("Enter second player name:");
			Player player2 = new Player(scan.nextLine());

			System.out.println("Player 1: enter you answer:");
			player1.setPlayerGuessNum(Integer.parseInt(scan.nextLine()));

			System.out.println("Player 2: enter you answer:");
			player2.setPlayerGuessNum(Integer.parseInt(scan.nextLine()));
			} while ( (guessNumber.checkPlayerNum(player1) != true) && (guessNumber.checkPlayerNum(player2) != true) );

	}
}