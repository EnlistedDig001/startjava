package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private String mathSign;
	private String mathExpression;
	private String[] splittedMathExpression;

	public void setMathExpression(String mathExpression) {
		this.mathExpression = mathExpression;
	}

	public void calculateResult() {
		splittedMathExpression = mathExpression.split(" ");
		firstNumber = Integer.parseInt(splittedMathExpression[0]);
		mathSign  = splittedMathExpression[1];
		secondNumber = Integer.parseInt(splittedMathExpression[2]);

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
			System.out.println(Math.pow(firstNumber,secondNumber));
			break;
		default:
			System.out.println("Not math expression!");
		}
 	}
}