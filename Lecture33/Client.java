package Lecture33;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		//Case 1
		P obj1 = new P (); 
		
		//Case 2
		P obj2 = new C();
		
		// Data members collision LHS!
		System.out.println(obj2.data);
		System.out.println(((C)obj2).data);
		System.out.println(((C)obj2).dataC);
		System.out.println(((C)obj2).datap);
		
		System.out.println("===============");
		obj2.fun();
		((C)obj2).fun();
		
		//Case 3 
		P obj3 = new P(); 
		System.out.println(obj3);
		
		//Case 4
//		C obj4 = new P(); 
		
		ArrayList<Integer> AL = new ArrayList<>(); 
		System.out.println(AL);
		
		
		
	}

}
