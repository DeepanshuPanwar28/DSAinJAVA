package Lecture13;

import java.util.Scanner;

public class Strings_Demo2 {

	public static void main(String[] args) {
		String str = "Hello Bhai";
		System.out.println(str.substring(1, 4));
		System.out.println(str.substring(1));
		System.out.println(str.startsWith("LOL"));
		System.out.println(str.endsWith("Bhai"));

		Scanner scn = new Scanner(System.in);
//		word!!

//		String ss1 = scn.next();
//		String ss2 = scn.next();
//		System.out.println(ss1 + " " + ss2);

		String sentence = scn.nextLine();
		System.out.println(sentence + "~~~~");
		System.out.println("======================");
		String word1 = "Hello"; 
		String word2 = str.substring(0, 5);
		System.out.println(word1 == word2);
		System.out.println(word1 + "==" + word2);
		
//		Compare content
		System.out.println(word1.contentEquals(word2));
		
	}

}
