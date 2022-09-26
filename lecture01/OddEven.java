package lecture01;

public class OddEven {

	public static void main(String[] args) {
	
		int num = 14;
		int rem = num%2;
		System.out.println(rem);
		if(rem==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}
	}

}
