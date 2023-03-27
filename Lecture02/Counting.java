package Lecture02;

import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int count = 1;
		while (count <= n) {
			System.out.println(count);
			count++; 
		}
	}

}
