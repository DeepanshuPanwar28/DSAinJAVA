package Lecture40;

public class Generics_01 {
	public static void main(String[] args) {
		Student [] arr = new Student[5]; 
//		Student newStudent = new Student ("Deepanshu", 28); 
//		newStudent.Print(); 
		
		arr[0] = new Student ("A", 11);
		arr[1] = new Student ("B", 1);
		arr[2] = new Student ("C", 161);
		arr[3] = new Student ("D", 111);
		arr[4] = new Student ("E", 112);
		
//		System.out.println(s1);
		display(arr); 
//		int data = 5; 
//		Object data1 = 5; 
//		System.out.println(data);
//		System.out.println(data1);
		
		
		static class LL implements Comparator <Student>{
			@Override
			
			public int compare (Student o1, Student o2) {
				return o1.Name.compareTo(o2.Name); 
			}
		}
	}

//	public static Object display(Object[] arr) {
//		for (Object obj : arr) {
//			System.out.print(obj + " ");
//		}
//		System.out.println();
//		return null; 
//	}
	
	
	
	
	public static <TTT> void display(TTT[] arr) {
		
		for (TTT obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();
		
	}
	
}
