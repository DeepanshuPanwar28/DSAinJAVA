package Lecture40;

public class Static_1 {

	public static void main(String[] args) {
		System.out.println(Student.total_s);
		Student s1 = new Student ("Deepanshu Panwar", 28);
		Student s2 = new Student ("Ashwani Kumar", 38);
		Student s3 = new Student ("Manpreet Sodhi", 38);
		Student s4 = new Student ("Kanta Rani", 60);
		Student s5 = new Student ("Anaisha Panwar", 7);
		System.out.println(Student.total_s);
		Hello(s1); 
		
	}
	public static void Hello(Student s1) {
		System.out.println(s1.name);
	}

}
