package com.tap.practicecoding;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrime(int n){
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		boolean res = checkPrime(n);
		if(res) {
			System.out.println("The given number is Prime");
		}
		else {
			System.out.println("The given number is not a Prime");
		}
	}

}
