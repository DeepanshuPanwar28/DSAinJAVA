package Lecture23;



public class Recursion_ArrayAllOccurances {

	public static void main(String[] args) {
		int [] arr = {10, 20, 30, 20, 20, 10, 20};
		int sp [] = all(arr, 20, 0, 0);
		for (int i : sp) {
			System.out.print(i + " ");
		}
		
	}
	public static int [] all(int [] arr, int ele, int i, int total) {
		if (i == arr.length) {
			return new int [total]; 
		}
		if (arr[i] == ele) {
			int [] sp = all(arr, ele, i + 1, total + 1);
			sp[total] = i;
			return sp; 
			
		} else {
			int [] sp = all(arr, ele, i + 1, total); 
			return sp; 
		}
		
		
		
	}

}
 