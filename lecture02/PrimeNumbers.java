package lecture02;

public class PrimeNumbers {

	public static void main(String[] args) {
		int n = 6;
		int d = 1;
		int numFact = 0;
		while (d <=n) {
			int rem = n%d;
			if (rem == 0) {
//				System.out.println("prime number");
				numFact = numFact + 1;
			}
			d++;
		}
//		System.out.println(numFact);
		if (numFact==2) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
		

	}

}
