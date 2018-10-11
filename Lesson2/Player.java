public class Player {
	private String playerName;
	private int playerGuessNumber;

	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerGuessNumber(int guessedNumber) {
		playerGuessNumber = guessedNumber;
	}
	public int getPlayerGuessNumber() {
		return playerGuessNumber;
	}

	public void playersRegistration() {
		System.out.println("Enter player 1 name, then enter player 2 name on the next line.");
	}

	public void Player(String playerName) {
		this.playerName = playerName;
	}
}