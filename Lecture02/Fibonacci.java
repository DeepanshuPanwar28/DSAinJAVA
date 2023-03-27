package Lecture02;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int a = 0;
		int b = 1; 
		int count = 0; 
		int d = 0; 
		while (count < n) {
			d = 1; 
			int c = a + b; 
			System.out.println(b);
			a = b;
			b = c; 
			count++; 
		}
		System.out.println(d);
		
	}

}
