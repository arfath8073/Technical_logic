package com.tap.practicecoding;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int rem = 0;
		int rev = 0;
		int res = n;
		
		while (n!=0) {
			rem = n % 10;
			rev = (rev * 10) + rem;
			n = n/10;
		}
		System.out.println(rev);
		
		if(rev==res) {
			System.out.println("Given number is Palindrome");
		}
		else {
			System.out.println("Given number is not a Palindrome");
		}
	}
}