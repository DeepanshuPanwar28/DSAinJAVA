package Lecture11;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 88, 66, 55, 44, 22 };
		Display(arr);
		BubbleSort(arr);
		Display(arr);

	}

	public static void BubbleSort(int[] arr) {
		for (int end = 0; end < arr.length - 1; end++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
				}
			}

		}

	}

	public static void Display(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
