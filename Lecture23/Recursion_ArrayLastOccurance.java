package Lecture23;

public class Recursion_ArrayLastOccurance {

	public static void main(String[] args) {
		int [] arr = {10, 20, 20, 10, 30, 20};
		System.out.println(last(arr, 3, 10));
	}
	public static int last(int [] arr, int i, int ele) {
	if (i == arr.length) {
		return - 1;
	}
	int sp = last(arr, i + 1, ele);
	if (sp == -1 && arr[i] == ele) {
		return i; 
		
	}
	return sp; 
	}

}
