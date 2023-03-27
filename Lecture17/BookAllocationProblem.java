package Lecture17;

import java.util.Scanner;

public class BookAllocationProblem {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int tc = scn.nextInt(); 
		while (tc > 0) {
			int n = scn.nextInt(); 
			int students = scn.nextInt(); 
			int [] arr = new int [n]; 
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt(); 
			}
			int ans = 0;
			book(arr, students, ans);
			tc--; 
		}
		
	}

	public static void book(int arr[], int students, int ans) {
		int s = 0;
		int e = 0;
		for (int i : arr) {
			e = e + i;
		}
		while (s <= e) {
			int pages = (s + e) / 2;
			if (isPossible(arr, pages, students)) {
				e = pages - 1;
				ans = pages;
			} else {
				s = pages + 1;
			}

		}
		System.out.println(ans);
	}

	public static boolean isPossible(int[] arr, int pages, int students) {
		int curr_student = 1;
		int load = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > pages) {
				return false;
			} else if (load + arr[i] > pages) {
				curr_student++;
				load = arr[i];
			} else {
				load = load + arr[i];
			}
		}
		if (curr_student > students) {
			return false;
		} else {
			return true;
		}
	}

}
