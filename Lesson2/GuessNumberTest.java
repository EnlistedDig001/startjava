import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber();
		String userAnswer;

		do {
			System.out.println("\n" + "Enter first player name:");
			Player player1 = new Player(scan.nextLine());

			System.out.println("Enter second player name:");
			Player player2 = new Player(scan.nextLine());

			guessNumber.startGame(player1, player2);
			do {
				System.out.println("\n" + "Do you want to start over ? y/n");
				userAnswer = scan.nextLine();

			} while ( !(userAnswer.equals("y")) && !(userAnswer.equals("n"))); 
		} while (userAnswer.equals("y"));
	}
}