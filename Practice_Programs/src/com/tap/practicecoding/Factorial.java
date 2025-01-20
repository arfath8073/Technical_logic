package com.tap.practicecoding;

import java.util.Scanner;

public class Factorial {
	
	public static int findFactorial(int n){
		
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scan.nextInt();
		int res = findFactorial(n);
		
		System.out.println(res);
	}
}
