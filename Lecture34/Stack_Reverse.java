package Lecture34;

import java.util.Stack;

public class Stack_Reverse {

	public static void main(String[] args) {
		Stack<Integer> S = new Stack<Integer>(); 
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		System.out.println(S);
		Reverse(S); 
		System.out.println(S);
//		reverseprint(S); 
	}
	public static void reverseprint(Stack <Integer> S) {
		if (S.isEmpty()) {
			return; 
		}
		int temp = S.pop(); 
		reverseprint(S); 
		System.out.println(temp);
		S.push(temp); 
	}
	public static void Reverse (Stack<Integer> S) {
		Stack <Integer> copi = new Stack <>(); 
		Copy(S, copi);
		while (!copi.isEmpty()) {
			S.add(copi.pop()); 
		}
		
	}
	public static void Copy(Stack <Integer> S, Stack <Integer> copi) {
		if (S.isEmpty()) {
			return; 
		}
		int temp = S.pop(); 
		Copy(S, copi);  
		System.out.println(temp);
		copi.add(temp); 
	}

}
