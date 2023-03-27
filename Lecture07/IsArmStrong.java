package Lecture07;

import java.util.Scanner;

public class IsArmStrong {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		PrintTill(n); 
	}
	public static void PrintTill(int n) {
		for (int num = 1; num <= n; num++) {
			if (isArmStrong(num)) {
				System.out.println(num);
			}
		}
	}
	public static boolean isArmStrong (int num) {
		int count = NumOfDigits(num);
		int temp = num; 
		int ans = 0; 
		while (temp != 0) { 
			int digit = temp % 10;
			int mult = (int)Math.pow(digit, count); 
			ans = ans + mult;
			temp = temp / 10; 
		}
		if (ans == num) {
			return true;
		} else {
			return false;
		}
	}
	public static int NumOfDigits(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10; 
			count++; 
		} return count; 
	}
	

}
