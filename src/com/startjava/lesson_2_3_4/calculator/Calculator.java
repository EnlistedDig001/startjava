package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private String mathSign;

	public void calculateResult(String mathExpression) {
		firstNumber = Integer.parseInt(mathExpression.split(" ")[0]);
		mathSign  = mathExpression.split(" ")[1];
		secondNumber = Integer.parseInt(mathExpression.split(" ")[2]);

		System.out.print(mathExpression + " = ");

		switch (mathSign) {
			case "+":
				System.out.println(firstNumber + secondNumber);
				break;
			case "-":
				System.out.println(firstNumber - secondNumber);
				break;
			case "/":
				System.out.println((double)firstNumber / (double)secondNumber);
				break;
			case "*":
				System.out.println(firstNumber * secondNumber);
				break;
			case "%":
				System.out.println(firstNumber % secondNumber);
				break;
			case "^":
				System.out.println(Math.pow(firstNumber, secondNumber));
				break;
			default:
				System.out.println("Not math expression!");
		}
 	}
}