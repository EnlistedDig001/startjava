import java.util.Scanner;
import java.io.*;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();

		System.out.println("Input first number:");
		myCalculator.setFirstNumber( Integer.parseInt( scan.nextLine()));

		System.out.println("Input math sign:");
		myCalculator.setMathSign(scan.nextLine ());

		System.out.println("Input second number:");
		myCalculator.setSecondNumber( Integer.parseInt(scan.nextLine()));	
		
		myCalculator.сalculateResult();
	}

	
}