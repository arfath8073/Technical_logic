package com.tap.practicecoding;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value of a:");
		int a = scan.nextInt();
		System.out.println("Enter the value of b:");
		int b = scan.nextInt();
		
		//WITH USING 3RD VARIABLE
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println(a+" "+b);
		
		//WITHOUT USING THIRD  VARIBALE
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}

}
