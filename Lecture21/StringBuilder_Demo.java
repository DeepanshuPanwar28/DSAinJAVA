package Lecture21;

public class StringBuilder_Demo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("LOL"); 
		String str = "LOL"; 
		
		//print
		System.out.println(sb);
		System.out.println(str);
		
		//len
		System.out.println(sb.length());
		System.out.println(str.length());
		
		//charAt
		System.out.println(sb.charAt(0));
		System.out.println(str.charAt(0));
		
		//subString
		System.out.println(sb.substring(1));
		System.out.println(str.substring(1));
		
		//indexof
		System.out.println(sb.indexOf("LO"));
		
//		str[i] = ch?!
//		set ch?!
		sb.setCharAt(0, 'P'); // O(1)
		
		//Concatenation at last index
		System.out.println(sb);
		sb.append("POPOPOP"); 
		System.out.println(sb);
		
		//adding at index
		sb.insert(1, "iii");  // O(n)
		System.out.println(sb);
		
		//deletion
		sb.deleteCharAt(3); // O(n)
		System.out.println(sb);
		
		String ans = sb.toString(); 
		System.out.println(ans);
	}

}
