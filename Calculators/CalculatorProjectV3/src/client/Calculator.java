package client;

import java.util.Scanner;
import bus.Operation;

public class Calculator {

	public static void main(String[] args) {

		double add, sub, mult, div;

		Scanner scan = new Scanner(System.in);

		double number1, number2;

		try {
			System.out.print(" Input the first number: ");
			number1 = scan.nextInt();

			try {
				System.out.print(" Input the second number: ");
				number2 = scan.nextInt();

				add = Operation.add(number1, number2);
				sub = Operation.sub(number1, number2);
				mult = Operation.mult(number1, number2);
				div = Operation.div(number1, number2);

				System.out.println("The addition of " + number1 + " and " + number2 + " is " + add);
				System.out.println("The subtraction of " + number1 + " and " + number2 + " is " + sub);
				System.out.println("The multiplication of " + number1 + " and " + number2 + " is " + mult);
				System.out.println("The division of " + number1 + " and " + number2 + " is " + div);


			} catch (Exception e){
				System.out.println("Please enter a valid second number!");
			}

		} catch (Exception e){
			System.out.println("Please enter a valid first number!");
		}

		scan.close();
	}
}
