package com.tap.practicecoding;

import java.util.Scanner;

public class Factors {
	
	public static void findFactors(int n){
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		findFactors(n);
		
	}
	
}
