import java.util.Scanner;
import java.io.*;

public class CalculatorTest{
	public static void main(String[] args) {
		startTest();
	}

	public static void askUserToStartAgain() {
		Scanner scan = new Scanner(System.in);

		System.out.println("You want to continue ? y/n");
		String userWantsToContinue = scan.nextLine();
		
		if (userWantsToContinue == "y") {
			//start program again please;
			startTest();
			System.out.println(userWantsToContinue);
			//System.out.println("Start it with your hands");
		
		} else if (userWantsToContinue == "n") {
			System.out.println("Bye!");
			System.out.println(userWantsToContinue);
		
		} else {
			System.out.println(userWantsToContinue);
			askUserToStartAgain();
		}
	}

	public static void startTest() {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();

		System.out.println("Input first number:");
		myCalculator.setFirstNumber( Integer.parseInt( scan.nextLine() ) );

		System.out.println("Input math sign:");
		myCalculator.setMathSign(scan.nextLine ());

		System.out.println("Input second number:");
		myCalculator.setSecondNumber( Integer.parseInt( scan.nextLine() ) );	
		
		myCalculator.CalculateResult();

		// System.out.println(myCalculator.getFirstNumber());
		// System.out.println(myCalculator.getMathSign());
		// System.out.println(myCalculator.getSecondNumber());

		askUserToStartAgain();
	}
}