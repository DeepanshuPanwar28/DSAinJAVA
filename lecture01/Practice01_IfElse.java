package lecture01;

import java.util.Scanner;

public class Practice01_IfElse {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int marks = scn.nextInt();
		
		
		if(marks>=40&&marks<50)

	{
		System.out.println("E Grade");
	}else if(marks>=50&&marks<60)
	{
		System.out.println("D Grade");
	}else if(marks>=60&&marks<70)
	{
		System.out.println("C Grade");
	}else if(marks>=70&&marks<80)
	{
		System.out.println("B Grade");
	}else if(marks>=80&&marks<90)
	{
		System.out.println("A Grade");
	}else if(marks>90)
	{
		System.out.println("Grade A+");
	}else System.out.println("Fail");
}

}
