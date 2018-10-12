import java.util.Random;

public class GuessNumber {
	Random rand = new Random();
	String goToNextLine = System.getProperty("line.separator");
	int computerRandomNum = rand.nextInt(100) + 0;

	public void generateRandomNum() {
		System.out.println("Computer guessed the number from 0 to 100. What number is it?.");

		computerRandomNum = rand.nextInt(100) + 0;
	}

	public boolean checkPlayerNum(Player player) {
		if (player.getPlayerGuessNum() ==computerRandomNum) {
			return true;

		} else if (player.getPlayerGuessNum() < computerRandomNum) {
			System.out.println(goToNextLine + player.getPlayerName() + "'s number is less.");
			return false;
			
		} else {
			System.out.println(goToNextLine + player.getPlayerName() + "'s number is greater.");
			return false;
		}

	}
}