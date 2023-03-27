package Lecture21;

public class String_Demo_Immutable {

	public static void main(String[] args) {
		String str1 = "LULU";
		String str2 = str1;
		System.out.println(str2);
		str1 = "dulu"; // Strings are immutable
		System.out.println(str2);
	}

}
