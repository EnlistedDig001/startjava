import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String goToNextLine = System.getProperty("line.separator");
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber();

		do {
			System.out.println(goToNextLine + "Enter first player name:");
			Player player1 = new Player(scan.nextLine());

			System.out.println("Enter second player name:");
			Player player2 = new Player(scan.nextLine());
			guessNumber.generateRandomNum();
			do {
				System.out.println(goToNextLine + player1.getPlayerName() + ": enter you answer:");
				player1.setPlayerGuessNum(Integer.parseInt(scan.nextLine()));

				System.out.println(player2.getPlayerName() + ": enter you answer:");
				player2.setPlayerGuessNum(Integer.parseInt(scan.nextLine()));

			} while ( !(guessNumber.checkPlayerNum(player1)) && !(guessNumber.checkPlayerNum(player2)) );

			if (player1.getPlayerGuessNum() == player2.getPlayerGuessNum() ) {
				System.out.println(goToNextLine + "Both players was right!");
			} else if (guessNumber.checkPlayerNum(player1)) {
				System.out.println(goToNextLine + player1.getPlayerName() + " wins!");
			} else {
				System.out.println(goToNextLine + player2.getPlayerName() + " wins!");
			}

			System.out.println(goToNextLine + "Do you want to start over ? y/n");
		
		} while (scan.nextLine().equals("y"));

	}
}