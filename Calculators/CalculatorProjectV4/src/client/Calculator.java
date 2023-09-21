package client;

import java.util.Scanner;

import business.Operation;

public class Calculator {

	public static void main(String[] args) {

		int op;
		boolean testNumber1 = true;
		boolean testNumber2 = true;
		boolean loopMenu = true;

		Scanner scan = new Scanner(System.in);

		Operation operation = new Operation();

		do {
			try {
				testNumber1 = true;
				System.out.println("Please inform the first number:");
				operation.setNumber1(scan.nextDouble());
			} catch (Exception e) {
				System.out.println("\nPlease enter a valid first number!");
				scan.next();
				testNumber1 = false;
			}
		} while (!testNumber1);

		do {
			try {
				testNumber2 = true;
				System.out.println("Please inform the second number:");
				operation.setNumber2(scan.nextDouble());
			} catch (Exception e) {
				System.out.println("\nPlease enter a valid second number!");
				scan.next();
				testNumber2 = false;
			}
		} while (!testNumber2);

		do {
			loopMenu = true;
			System.out.println("\n========= Select one of the operations =========");
			System.out.println("\n(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			System.out.println("(5) Quit");

			try {
				op = scan.nextInt();
				switch (op) {

				case 1:
					System.out.println("\nThe sum of " + operation.getNumber1() + " and " + operation.getNumber2()
							+ " is " + operation.Add());
					break;

				case 2:
					System.out.println("\nThe subtraction of " + operation.getNumber1() + " and "
							+ operation.getNumber2() + " is " + operation.Sub());
					break;

				case 3:
					System.out.println("\nThe multiplication of " + operation.getNumber1() + " and "
							+ operation.getNumber2() + " is " + operation.Mult());
					break;

				case 4:
					System.out.println("\nThe division of " + operation.getNumber1() + " and " + operation.getNumber2()
							+ " is " + operation.Div());
					break;

				case 5:
					loopMenu = false;
					System.out.println("\nThanks for using my calculator!");
					break;

				default:
					System.out.println("\nPlease enter a valid menu option!");
					break;
				}

			} catch (Exception e) {
				System.out.println("\nPlease enter a valid menu option!");
				scan.next();
			}

		} while (loopMenu);

		scan.close();

	}

}
