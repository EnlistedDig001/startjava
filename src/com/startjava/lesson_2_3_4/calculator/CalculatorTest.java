package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculator myCalculator = new Calculator();
		char userAnswer;

		do {
		    System.out.println("Enter math expression like 2 + 2 ");
			myCalculator.calculateResult(scan.nextLine());

			do {
				System.out.println("Do you want to start over ? y/n");
				userAnswer = scan.next().charAt(0);
				scan.nextLine();

			} while (userAnswer != 'y' && userAnswer != 'n'); 
		
		} while (userAnswer == 'y');
	}
}