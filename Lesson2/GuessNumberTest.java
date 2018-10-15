import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		String goToNextLine = System.getProperty("line.separator");
		Scanner scan = new Scanner(System.in);
		GuessNumber guessNumber = new GuessNumber();
		String userWantsToContinue;

		do {
			guessNumber.startGame();
			do {
			System.out.println(goToNextLine + "Do you want to start over ? y/n");
			userWantsToContinue = scan.nextLine();

			} while ( !(userWantsToContinue.equals("y")) && !(userWantsToContinue.equals("n"))); 
		} while (userWantsToContinue.equals("y"));

	}
}