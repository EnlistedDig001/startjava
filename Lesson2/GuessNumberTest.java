import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		startGame();
	}

	public void startGame() {
		Scanner scan = new Scanner(System.in);

		playersRegistration();
		Player player1 = new Player(scan.nextLine());
		System.out.println("Enter second player name:");
		Player player2 = new Player(scan.nextLine());

	}
}