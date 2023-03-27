package Lecture07;

import java.util.Scanner;

public class Function_Demo3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(ifArmstrong(num));
	}

	public static boolean ifArmstrong(int a) {
		int ans = 0;
		int count = 0;
		int num1 = a;
		int num2 = a;
		while (num1 != 0) {
			num1 = num1 / 10;
			count++;
		}
		while (num2 != 0) {
			int digit = num2 % 10;
			int mult = (int) Math.pow(digit, count);
			ans = ans + mult;
			num2 = num2 / 10;
		}
		if (ans == a) {
			return true;
		} else {
			return false;
		}

	}

}
