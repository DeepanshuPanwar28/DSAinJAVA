package Lecture11;

public class Selection_Sort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
		Display(arr);
		SelectionSort(arr);
		Display(arr);

	}

	public static void SelectionSort(int[] arr) {
		for ( int count = 1; count<arr.length; count++) {
		int last = arr.length - count; 
		int max = last; 
		for (int i = 0; i <= last; i++) {
			if (arr[max] < arr[i]) {
			max = i; 
			}
		}
		int temp = arr[max];
		arr[max] = arr[last];
		arr[last] = temp;
		
		}

	}

	public static void Display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
