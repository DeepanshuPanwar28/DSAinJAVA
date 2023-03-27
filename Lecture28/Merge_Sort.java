package Lecture28;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
//		int [] arr1 = {10, 30, 50, 80, 100};
//		int [] arr2 = {15, 20, 25, 40, 90};  
//		System.out.println(Arrays.toString(MergeArr(arr1, arr2)));
		int [] arr = {50, 40, 30, 20, 10}; 
		System.out.println(Arrays.toString(Merge(arr, 0, arr.length - 1)));
		
	}
	public static int [] MergeArr(int [] arr1, int [] arr2) {
		int idx1 = 0;
		int idx2 = 0;
		int i = 0;
		int [] ans = new int [arr1.length + arr2.length]; 
		while (idx1<arr1.length && idx2<arr2.length) {
			if (arr1[idx1] < arr2[idx2]) {
				ans[i] = arr1[idx1]; 
				idx1++; 
				i++; 
			} else {
				ans[i] = arr2[idx2]; 
				idx2++;
				i++; 
			}
		}
		while (idx1<arr1.length) {
			ans[i] = arr1[idx1]; 
			idx1++;
			i++; 
		}
		while (idx2<arr2.length) {
			ans[i] = arr2[idx2]; 
			idx2++;
			i++;
		}
		return ans; 
		
	}

	public static int[] Merge(int [] arr, int s, int e) {
		if (s == e) {
			int [] ans = new int [1]; 
			ans [0] = arr[s]; 
			return ans; 
		}
		int mid = (s + e) / 2;
		int [] sp1 = Merge(arr, s, mid);
		int [] sp2 = Merge(arr, mid + 1, e);
		return MergeArr(sp1, sp2); 
		
	}
}
