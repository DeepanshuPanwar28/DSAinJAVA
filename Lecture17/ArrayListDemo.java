package Lecture17;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		int [] arr = new int [5];
		ArrayList<Integer> AL = new ArrayList<Integer>(); 
		System.out.println(AL);
		
		// how to add an element in the array list
		AL.add(10);
		AL.add(20);
		AL.add(30); 
		System.out.println(AL);
		AL.add(40);
		AL.add(50); 
		AL.add(60); 
		System.out.println(AL);
		
		// how to figure out the size of array list
		System.out.println(arr.length);
		System.out.println(AL.size());
		
		// how to set elements in array list
		// indexing of array list
		arr[0] = 10; 
		AL.set(0, 99); // place 99 at index 0
		System.out.println(AL);
		
		// how to get the value at index 3?
		System.out.println(AL.get(3));
		
		// how to get the value of the last index
		System.out.println(AL.get(AL.size() - 1));
		
		
		// how to replace/add a value at any index of array list
		AL.add(2, 70); 
		System.out.println(AL);
		
		//how to replace/add a value at the last index of array list
		AL.add(AL.size(), 80); 
		System.out.println(AL);
		
		// how to remove an element in the array list
		int alio = AL.remove(2); 
		System.out.println(AL);
	}

}
