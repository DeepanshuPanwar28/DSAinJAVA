package Lecture12;

import java.util.Scanner;

public class Strings_Demo {

	public static void main(String[] args) {
		String str = "hello"; 
		System.out.println(str.length());
		
		// how to print a character at an index
		char ch = str.charAt(0); 
		System.out.println(ch);
		
		// how to print the last character
		System.out.println(str.charAt(str.length() - 1));
		
		
		// how to take input
		Scanner scn = new Scanner (System.in);
//		String input = scn.next();
//		char ch22 = input.charAt(0); 
//		System.out.println(input);
		
		// how to search the index of a string
		str = "Hello How Are You?"; 
		// gives the index from left to right
		System.out.println(str.indexOf("o")); 
		
		// gives the index from right to left
		System.out.println(str.lastIndexOf("u"));
		
		str = "abcd"; 
		for (int s = 0; s<str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++){
				System.out.println(str.substring(s, e));
			}
		}
				
	}

}
