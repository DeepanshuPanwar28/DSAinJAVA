package Lecture02;

import java.util.Scanner;

public class SumOfNNaturalNumbers {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int n = scn.nextInt();
	int numbers = 1; 
	int sum = 0; 
	while (numbers <= n) {
		 sum = sum + numbers; 
		 numbers++;
	}
	System.out.println(sum);
	
	}

}
