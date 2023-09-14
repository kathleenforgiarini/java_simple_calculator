package client;
//import java.lang.*;

import java.util.Scanner;

public class Program {
	
	public static int add(int p1, int p2) {
		return p1 + p2;
	}
	
	public static int mul(int p1, int p2) {
		return p1 * p2;
	}
	
	public static int sub(int p1, int p2) {
		return p1 - p2;
	}

	public static int div(int p1, int p2) {
		return p1 / p2;
	}
	
	public static void main(String[] args) {

		// -1- - variable declaration
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		int sum, mul, sub, div;
		
		
		// -2- - input/output 
		
		System.out.println("\t\t\t ---- Calculator (Version 02) ----------\n");
		System.out.println(" Input the first integer number: ");
		x = scan.nextInt();
		System.out.println(" Input the second integer number: ");
		y = scan.nextInt();
				
		sum = add(x,y);
		mul = mul(x,y);
		sub = sub(x,y);
		div = div(x,y);
		
		System.out.println(x + " + " + y + " = " + sum);
		System.out.println(x + " * " + y + " = " + mul);
		System.out.println(x + " - " + y + " = " + sub);
		System.out.println(x + " / " + y + " = " + div);
		
		scan.close();
	}
}
