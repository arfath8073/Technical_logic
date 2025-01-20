package com.tap.practicecoding;

import java.util.Scanner;

public class CountDigits {

	public static int countDigits(long n){
		int count = 0;
		while(n!=0) {
			n = n / 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		int res = countDigits(n);
		System.out.println(res);		
	}
}
