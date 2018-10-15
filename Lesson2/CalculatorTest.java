import java.util.Scanner;
import java.io.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();
		String userWantsToContinue;
		do {
			System.out.println("Input first number:");
			myCalculator.setFirstNumber(Double.parseDouble( scan.nextLine()));

			System.out.println("Input math sign:");
			myCalculator.setMathSign(scan.nextLine());

			System.out.println("Input second number:");
			myCalculator.setSecondNumber(Double.parseDouble(scan.nextLine()));	
			
			myCalculator.сalculateResult();
			do {
				System.out.println( "Do you want to start over ? y/n");
				userWantsToContinue = scan.nextLine();

			} while ( !(userWantsToContinue.equals("y")) && !(userWantsToContinue.equals("n"))); 
		
		} while (userWantsToContinue.equals("y"));

	}

	
}