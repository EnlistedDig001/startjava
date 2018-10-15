import java.lang.*;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private char mathSign;

	public void setFirstNumber(double firstNumber){
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSecondNumber() {
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
			System.out.println(firstNumber / secondNumber);
			break;
		case '*':	
			System.out.println(firstNumber * secondNumber);
			break;
		case '%':	
			System.out.println(firstNumber % secondNumber);
			break;
		case '^':	
			if (secondNumber == 0) {
				System.out.println(1);
			} else {
				double result = firstNumber;
				for (double i = 2; i <= secondNumber; i++) {
					result *= firstNumber;
				 }
				 System.out.println(result); 
			}
			break;
		default:
			System.out.println("You picked the wrong house, fool!");					
		}
 	}
}