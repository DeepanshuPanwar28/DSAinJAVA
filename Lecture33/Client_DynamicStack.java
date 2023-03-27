package Lecture33;

public class Client_DynamicStack {

	public static void main(String[] args) {
		DynamicStack DS = new DynamicStack (); 
		DS.add(10);
		DS.add(20);
		DS.add(30);
		DS.add(40);
		DS.add(50);
		DS.add(60);
		DS.add(70);
		DS.add(80);
		DS.add(90);
		DS.add(100);
		DS.display(); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		System.out.println(DS.pop()); 
		DS.add(300);
		DS.display(); 


	}

}
