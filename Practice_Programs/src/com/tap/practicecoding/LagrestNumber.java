package com.tap.practicecoding;

import java.util.Scanner;

public class LagrestNumber {
	
	public static int findLargest(int n,int m,int k){
		
		if(n > m && n > k) {
			return n;
		}
		else if(m > n && m > k) {
			return m;
		}
		else {
			return k;
		}
	}
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = scan.nextInt();
		System.out.println("Enter the value of m:");
		int m = scan.nextInt();
		System.out.println("Enter the value of k:");
		int k = scan.nextInt();
		int res = findLargest(n,m,k);
		System.out.println("The Largest Number is:");
		System.out.println(res);
	}
}
