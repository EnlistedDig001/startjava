import java.util.Random;

public class GuessNumber {
	Random rand = new Random();
	int computerRandomNum = rand.nextInt(100) + 0;

	public int generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100.");

		computerRandomNum = rand.nextInt(100) + 0;
	}

	public boolean checkPlayerNum(Player player) {
		if (player.getPlayerGuessNum().equals(computerRandomNum)) {
			return true;
		} else if (player.getPlayerGuessNum() < computerRandomNum) {
			System.out.println("Your number is less.");
			return false;
		} else {
			System.out.println("Your number is greater.");
			return false;
		}

	}
}