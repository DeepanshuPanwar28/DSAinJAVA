package Lecture06;

import java.util.Scanner;

public class CelsiusToFarenheit {

	public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);
	int min = scn.nextInt(); 
	int max = scn.nextInt();
	int step = scn.nextInt(); 
	int F = min; 
	while (F <= max) {
		int c = (int)(5.0/9*(F - 32)); 
		System.out.println(F + "\t" + c);
		F = F + step; 
	}
	}

}
