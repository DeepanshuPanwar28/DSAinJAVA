package Lecture05;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		char ch = scn.next().charAt(0); 
		if (ch >= 'a' &&  ch <= 'z') {
			System.out.println("Lower");
		} else {
			System.out.println("Upper");
		}
	}

}
