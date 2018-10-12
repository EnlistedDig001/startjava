public class Player {
	private String playerName;
	private int playerGuessNumber;

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerGuessNum(int guessedNumber) {
		playerGuessNumber = guessedNumber;
	}

	public int getPlayerGuessNum() {
		return playerGuessNumber;
	}

	public void Player(String playerName) {
		this.playerName = playerName;
	}
}