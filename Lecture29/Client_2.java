package Lecture29;

public class Client_2 {

	public static void main(String[] args) {
	Student s = new Student();
	s.Age = 1;
	s.Name = "Slim Shady"; 
	s.Intro(); 
	System.out.println(s);
	
	Student s2 = new Student (); 
	s2.Age = 28;
	s2.Name = "Deepanshu";
	s2.Intro(); 
	
	s2.Party("pappu");
	}

}
