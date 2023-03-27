package Lecture11;

public class Insertion_Sort {

	public static void main(String[] args) {
		int[] arr = { 1, 56, 3, 43, 9, 70, 57, 2 };
		Display(arr);
		InsertionSort(arr);
		Display(arr);

	}

	public static void InsertionSort(int[] arr) {
		for (int count = 0; count < arr.length - 1; count++) {
		int idx = count;
		int insert = arr[idx + 1]; 
		while ( idx >= 0 && arr[idx] > insert) {
			arr[idx + 1] = arr[idx]; 
			idx--; 
		}
		
		arr[idx + 1] = insert; 
		}
	}

	public static void Display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
