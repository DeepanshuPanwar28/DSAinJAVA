package Lecture18;

import java.util.ArrayList;

public class ArrayListSum {

	public static void main(String[] args) {
		int arr [] = {9, 8, 7, 5};
		int arr2 [] =   {9, 6, 7}; 
		System.out.println(Sum(arr, arr2));
	}
	public static ArrayList<Integer> Sum ( int [] arr, int [] arr2){
		int carry = 0; 
		int idx1 = arr.length - 1;
		int idx2 = arr2.length - 1;
		ArrayList<Integer> AL = new ArrayList<>(); 
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry; 
			if (idx1>= 0) {
				sum = sum + arr[idx1]; 
			}
			if (idx2>= 0) {
				sum = sum + arr2[idx2]; 
			}
			carry = sum / 10; 
			int dogot = sum % 10; 
			AL.add(0, dogot); 
			idx1--;
			idx2--; 
		}
		if (carry > 0) {
			AL.add(0, 1); 
		}
		return AL;
	}

}
