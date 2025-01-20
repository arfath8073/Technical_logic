package com.tap.practicecoding;

import java.util.Scanner;

public class PrimeNumbersUptoN {
	
	public static void checkPrime(int n){
		for(int i=2;i<=n;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int n){
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
		checkPrime(n);
		
	}
	
}
