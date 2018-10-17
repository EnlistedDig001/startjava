import java.util.Scanner;
import java.io.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();
		char userAnswer;

		do {
			System.out.println("Enter first number:");
			myCalculator.setFirstNumber(scan.nextInt());

			System.out.println("Enter math sign:");
			myCalculator.setMathSign(scan.next().charAt(0));

			System.out.println("Enter second number:");
			myCalculator.setSecondNumber(scan.nextInt());	
			
			myCalculator.сalculateResult();
			do {
				System.out.println("Do you want to start over ? y/n");
				userAnswer = scan.next().charAt(0);

			} while (userAnswer != 'y' && userAnswer != 'n'); 
		
		} while (userAnswer == 'y');
	}
}