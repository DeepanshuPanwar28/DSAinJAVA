package Lecture40;

public class Student {
	String name;
	int age; 
	static int total_s; 
	
	Student (String name, int age){
		this.name = name;
		this.age = age; 
		total_s++; 
	}
	public void Print() {
		System.out.println(name + " " + age);
	}
	public static void print() { 
		System.out.println(total_s);
	}
	
	
}
