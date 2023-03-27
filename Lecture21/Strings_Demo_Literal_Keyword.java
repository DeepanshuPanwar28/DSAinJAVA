package Lecture21;

public class Strings_Demo_Literal_Keyword {

	public static void main(String[] args) {
		String str1 = "LOOLO";
		String str11 = "LOOLO";
		String str12 = "LOOLO";
		String str13 = "LOOLO";
		
		
		String str2 = new String ("LOOLO");
		String str21 = new String ("LOOLO");
		String str22 = new String ("LOOLO");
		String str23 = new String ("LOOLO");
		
		System.out.println(str21 == str22); //false
		
		System.out.println(str11 == str13); //true
	}

}
