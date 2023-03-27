package Lecture34;

public class Queue {

	int [] arr; 
	 int s; 
	 int size; 
	
	Queue() {
		arr = new int [5]; 
		s = 0;
		size = 0;
	}
	public int size () {
		return size; 
	}
	public boolean isEmpty() {
		return size() == 0; 
		
	}
	public boolean isFull() {
		return size () == arr.length; 
	}
	public void add (int ali) {
		if (isFull()){
			throw new RuntimeException ("maaf kardo, full hai ");
		}
		int idx =( s + size) % arr.length; 
		arr[idx] = ali; 
		size++; 
	}
	public int peek() {
		if (isFull()) {
			throw new RuntimeException ("there is no one here ");
		}
		return arr[s]; 
	}
	public int poll() {
		int ans = peek(); 
		s++; 
		s = s % arr.length; 
		s--; 
		return ans; 
	}
	public void display() {
		int idx = s;
		while (idx < s + size) {
			System.out.print(arr[idx] + " ");
			idx++; 
		}
		System.out.println();
	}

}
