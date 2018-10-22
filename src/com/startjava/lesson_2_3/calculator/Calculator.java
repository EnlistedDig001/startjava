package com.startjava.lesson_2_3.calculator;
import java.lang.*;

public class Calculator {
	private int firstNumber;
	private int secondNumber;
	private char mathSign;

	public void setFirstNumber(int firstNumber){
		this.firstNumber = firstNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setMathSign(char mathSign) {
		this.mathSign = mathSign;
	}

	public char getMathSign() {
		return mathSign;
	}

 	public void сalculateResult() {
 		switch (mathSign) {
		case '+':
			System.out.println(firstNumber + secondNumber);
			break;
		case '-':	
			System.out.println(firstNumber - secondNumber);
			break;
		case '/':	
			System.out.println((double)firstNumber / (double)secondNumber);
			break;
		case '*':	
			System.out.println(firstNumber * secondNumber);
			break;
		case '%':	
			System.out.println(firstNumber % secondNumber);
			break;
		case '^':
			int result = 1;
			for (int i = 1; i <= secondNumber; i++) {
				result *= firstNumber;
			 }
			System.out.println(result);
			break;
		default:
			System.out.println("You picked the wrong house, fool!");					
		}
 	}
}