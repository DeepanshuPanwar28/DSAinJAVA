package Lecture23;

public class RecursionArray1 {

	public static void main(String[] args) {
		int arr [] = {10, 20, 30, 40}; 
		print (arr, 0); 
	}
	public static void print (int [] arr, int i) { 
		
		// BP : from i to end
		// SP : from i to end - 1
		if (i == arr.length) {
			return; 
		}
		System.out.println(arr[i]);
		print(arr, i + 1); 
	}

}
