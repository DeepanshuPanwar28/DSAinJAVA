package Lecture29;

public class Student {
	 String Name;
	  int Age;
	
	
	
public void Intro() {
	System.out.println(this);
	System.out.println("Hi my name is " + Name + " my age is " + Age);
}
public void Party (String Name) {
	System.out.println(this.Name + " party with " + Name);
}

public int getAge() {
	return Age; 
	
}
public String getName() {
	return Name;
}
public void setAge (int ali) throws Exception {
	if (ali <0) {
		throw new Exception ("bhai kya"); 
	}
//	if (ali >= 0) {
//		this.Age = ali; 
//		return; 
//	}
this.Age = ali; 
//	throw new RuntimeException("kya be, galat kaam karega?"); 
	
}
}


