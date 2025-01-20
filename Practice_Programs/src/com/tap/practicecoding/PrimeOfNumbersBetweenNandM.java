package com.tap.practicecoding;

import java.util.Scanner;

public class PrimeOfNumbersBetweenNandM {
	
	public static void checkPrime(int n,int m){
		for(int i=n;i<=m;i++) {
			if(isPrime(i)) {
				System.out.println(i+" ");
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
		int m = scan.nextInt();
		checkPrime(n,m);
		
	}
	
}
