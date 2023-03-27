package Lecture09;

public class Array_Basics {

	public static void main(String[] args) {
		int [] arr = {10, 20, -4, 20, 19, 99, -98, 12, 25};
		int max = Max(arr); 
		System.out.println(max);
		int find = Find(arr, 19); 
		System.out.println(find);
	}
	public static int Max (int [] arr) {
		int max = Integer.MIN_VALUE; 
		for (int i : arr) {
			if (i > max) {
				max = i;  
			}
		}
		return max; 
	}
	public static int Find (int [] arr, int ele) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ele) { 
				return i;
			}
		}
		return -1; 
	}

}
