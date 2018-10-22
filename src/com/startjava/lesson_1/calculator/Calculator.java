package com.startjava.lesson_1.calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		 System.out.println("Введите первое число:");
		 int firstNum = scan.nextInt();

		 System.out.println("Введите знак математического действия:");
		 char mathSign = scan.next().charAt(0);

		 System.out.println("Введите второе число:");
		 int secondNum = scan.nextInt();

		 System.out.print(firstNum + " " + mathSign + " " + secondNum + " = ");

		 if (mathSign == '+') {
		 	System.out.println(firstNum + secondNum);
		 } else if (mathSign == '-') {
		 	System.out.println(firstNum - secondNum);
		 } else if (mathSign == '*') {
		 	System.out.println(firstNum * secondNum);
		 } else if (mathSign == '/') {
		 	System.out.println((double)firstNum / (double)secondNum);
		 } else if (mathSign == '%') {
		 	System.out.println(firstNum % secondNum);
		 } else if (mathSign == '^') {
		 	int result = 1;
		 	for (int i = 1; i <= secondNum; i++) {
		 		result *= firstNum;
		 	}
		 	System.out.println(result);
		 } else {
		 	System.out.println("Normal person: \"Stop it\" ");
		 }
	}
}