package Lecture09;

public class ReverseOfAnArray {

	public static void main(String[] args) {
	int [] arr = {10, 20, 30, 40, 50}; 
		int [] arr2 = new int [arr.length]; 
		Rev1(arr, arr2); 
		Rev2(arr); 
		Display(arr, arr2); 
	}
	public static void Display (int [] arr, int [] arr2) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
	}
	public static void Rev1 (int [] arr, int [] arr2) {
		int idx1 = 0;
		int idx2 = arr.length - 1;
		while (idx2 >= 0) {
			arr2[idx1] = arr[idx2]; 
			idx1++;
			idx2--; 
		}
	}
	public static void Rev2 (int [] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left]; 
			arr[left] = arr[right];
			arr[right] = temp; 
			left++;
			right--; 
		}
			
	} 
}
