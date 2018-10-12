import java.lang.*;

public class Calculator {
	private double firstNumber;
	private double secondNumber;
	private String mathSign;

	public void setFirstNumber(double num){
		firstNumber = num;
	}

	public double getFirstNumber(){
		return firstNumber;
	}

	public void setSecondNumber(double num){
		secondNumber = num;
	}

	public double getSecondNumber(){
		return secondNumber;
	}

	public void setMathSign(String sign){
		mathSign = sign;
	}

	public String getMathSign(){
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
				System.out.println(Math.pow(firstNumber, secondNumber));
			}
			break;
		default:
			System.out.println("You picked the wrong house, fool!");					
		}
 	}
}