package Lecture02;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int div = 1; 
		int count = 0; 
		while (div <= n) {
			if (n % div == 0) {
				count++; 
			}
			div++; 
		}
		if (count == 2){
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		
	}

}
