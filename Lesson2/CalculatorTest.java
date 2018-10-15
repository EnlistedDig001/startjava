import java.util.Scanner;
import java.io.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();
		char userWantsToContinue;
		do {
			System.out.println("Input first number:");
			myCalculator.setFirstNumber(scan.nextDouble());

			System.out.println("Input math sign:");
			myCalculator.setMathSign(scan.next().charAt(0));

			System.out.println("Input second number:");
			myCalculator.setSecondNumber(scan.nextDouble());	
			
			myCalculator.сalculateResult();
			do {
				System.out.println( "Do you want to start over ? y/n");
				userWantsToContinue = scan.next().charAt(0);

			} while ( !(userWantsToContinue =='y') && !(userWantsToContinue == 'n')); 
		
		} while (userWantsToContinue == 'y');

	}

	
}