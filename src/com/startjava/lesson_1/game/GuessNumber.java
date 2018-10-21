import java.util.*;

public class GuessNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int userGuessNum;

		System.out.println("Компьютер загадал число, Вы должны угадать его.");
		int computerGuessNum = rand.nextInt(100);

		do {
			System.out.println("Ваше число:");
			userGuessNum = scan.nextInt();

			if (userGuessNum < computerGuessNum) {
				System.out.println("Ваше число меньше загаданного.");			
			} else if (userGuessNum > computerGuessNum) {
				System.out.println("Ваше число больше загаданного.");
			}
		} while (userGuessNum != computerGuessNum);
		
		System.out.println("Вы правы.");	
	}
}