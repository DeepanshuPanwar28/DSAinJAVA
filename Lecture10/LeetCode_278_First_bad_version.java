package Lecture10;

import java.util.Scanner;

public class LeetCode_278_First_bad_version {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
		int n = 1;
		FirstBadVersion(n); 
	}
	public static int FirstBadVersion(int n) {
		int version = 10; 
		isBadVersion(version);
		return version; 
	
	}
	public static boolean isBadVersion(int version) {
		if (version <= 5) {
			return false; 
		} else {
			return true; 
		}
	}

}
