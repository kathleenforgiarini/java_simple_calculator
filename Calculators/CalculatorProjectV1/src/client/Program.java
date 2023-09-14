package client;
//import java.lang.*;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// -1- - variable declaration
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		int sum, mul, div, sub;
		
		
		// -2- - input/output 
		
		System.out.println("\t\t\t ---- Calculator (Version 01) ----------\n");
		System.out.println(" Input the first integer number: ");
		x = scan.nextInt();
		System.out.println(" Input the second integer number: ");
		y = scan.nextInt();
		sum = x + y;
		mul = x * y;
		div = x / y;
		sub = x - y;
		
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println(x + " * " + y + " = " + mul);
		System.out.println(x + " - " + y + " = " + sub);
		System.out.println(x + " / " + y + " = " + div);
	
		scan.close();
	}

}
