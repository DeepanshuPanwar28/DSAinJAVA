package Lecture05;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int mult = 1;
		int ans = 0;
				while (n !=0) {
					int digit = n % 10; 
					ans = ans + digit * mult;
					mult = mult * 2;
					n = n / 10; 
				}
				System.out.println(ans);
	}

}
