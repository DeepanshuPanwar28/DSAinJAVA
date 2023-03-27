package Lecture17;

public class WrapperClasses_Demo01 {

	public static void main(String[] args) {
		int i = 10; // Primitive data type
		Integer I = 10; //Non Primitive data type of int
		System.out.println(I); // prints the same way a string is printed
		
		i = null; // won't run because i is not an address but a value
		I = null; // will run because I is not a value but an address
		
		System.out.println(I);
		I = 99; 
		
		I = i; // known as autoboxing --> the value stored in i will go inside the address of I in heap memory 
		
		i = I; // unboxing -- > the value stored inside address of I will come outside and be stored inside i in stack memory
	}

}
