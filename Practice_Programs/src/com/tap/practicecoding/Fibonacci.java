package com.tap.practicecoding;

import java.util.Scanner;

public class Fibonacci {
	
	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			System.out.println(a + " ");
			int n = a + b;
			a = b;
			b = n;
			
		}
	}
}
