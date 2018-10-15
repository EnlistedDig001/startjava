import java.lang.*;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private String mathSign;

	public void setFirstNumber(double firstNumber){
		this.firstNumber = firstNumber;
	}

	public double getFirstNumber(){
		return firstNumber;
	}

	public void setSecondNumber(double secondNumber) {
		this.secondNumber = secondNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public void setMathSign(String mathSign) {
		this.mathSign = mathSign;
	}

	public String getMathSign() {
		return mathSign;
	}

 	public void сalculateResult() {
 		switch (mathSign) {
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "-":	
			System.out.println(firstNumber - secondNumber);
			break;
		case "/":	
			System.out.println(firstNumber / secondNumber);
			break;
		case "*":	
			System.out.println(firstNumber * secondNumber);
			break;
		case "%":	
			System.out.println(firstNumber % secondNumber);
			break;
		case "^":	
			if (secondNumber == 0) {
				System.out.println(1);
			} else {
				double firstNumberCopy = firstNumber;
				for (double i = 2; i <= secondNumber ; i++ ) {
					firstNumber = firstNumber * firstNumberCopy;
				 }
				 System.out.println(firstNumber); 
			}
			break;
		default:
			System.out.println("You picked the wrong house, fool!");					
		}
 	}
}