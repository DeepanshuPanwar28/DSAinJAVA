package Lecture30;

public class Client {

	public static void main(String[] args) {
		Student s = new Student(12, "Chottu"); 
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println("finally done");
		} 
		System.out.println("LOLO");
	}

}
