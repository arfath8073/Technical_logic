package com.tap.practicecoding;

import java.util.Scanner;

public class SumOfDigits {
	
	public static int sumOfDigits(int n){
		int sum = 0;
		while(n != 0) {
			sum = sum + n % 10;
			n = n/10;
		}
		return sum;		
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int res = sumOfDigits(n);
		System.out.println(res);
	}	
}
