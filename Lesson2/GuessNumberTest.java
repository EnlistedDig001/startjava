import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String userAnswer;
		Player player1 = new Player();
		Player player2 = new Player();
		GuessNumber guessNumber = new GuessNumber(player1, player2);

		do {
			System.out.println("\n" + "Enter first player name:");
			player1.setName(scan.nextLine());	

			System.out.println("Enter second player name:");
			player2.setName(scan.nextLine());			

			guessNumber.startGame();
			do {
				System.out.println("\n" + "Do you want to start over ? y/n");
				userAnswer = scan.nextLine();

			} while ( !(userAnswer.equals("y")) && !(userAnswer.equals("n"))); 
		} while (userAnswer.equals("y"));
	}
}