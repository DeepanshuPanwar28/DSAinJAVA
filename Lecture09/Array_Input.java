package Lecture09;

import java.util.Scanner;

public class Array_Input {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt(); 
		int [] arr = new int [n]; 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt(); 
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

}
