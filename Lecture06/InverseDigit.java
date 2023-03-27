package Lecture06;

import java.util.Scanner;

public class InverseDigit {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int num = scn.nextInt(); 
		int position =1; 
		int inverse = 0; 
		while (num != 0) {
			int digit = num % 10 ;
//			int iposition = digit; 
//			int idigit = position; 
			inverse = inverse + position * (int)(Math.pow(10, digit - 1));
			num = num / 10; 
			position++; 
		}
		System.out.println(inverse);
		
	}

}
