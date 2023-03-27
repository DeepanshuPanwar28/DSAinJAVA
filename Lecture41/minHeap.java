package Lecture41;

import java.util.ArrayList;

public class minHeap {
	ArrayList<Integer> AL;
	
	public int size() {
		return AL.size(); 
	}
	public boolean isEmpty() {
		return AL.isEmpty(); 
	}
	public void disp() {
		System.out.println(AL);
	}
	public int peek () {
		return AL.get(0); 
	}
	public void add (int ali) {
		AL.add(ali); 
		Upheapify(AL.size() - 1); 
	}
	private void Upheapify(int child) {
		int parent = (child - 1)/2; 
		if (AL.get(parent)>AL.get(child)) {
			swap (child, parent);
			Upheapify(parent); 
		}
	}
	public void swap (int i, int j) {
		
	}


	

}
