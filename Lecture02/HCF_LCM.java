package Lecture02;

import java.util.Scanner;

public class HCF_LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n1 = scn.nextInt(); 
		int n2 = scn.nextInt(); 
		int divisor = n1;
		int dividend = n2;
		while (divisor % dividend != 0) {
			int rem = dividend % divisor; 
				dividend = divisor; 
				divisor = rem; 
		}
		System.out.println(divisor); 
	}

}
