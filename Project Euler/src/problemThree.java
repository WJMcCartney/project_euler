import java.util.ArrayList;

public class problemThree {

	public static void main(String[] args) {
		ArrayList<Long> factors = new ArrayList<Long>();
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		long givenInput = 600851475143L;
			for (long i=2L; i<givenInput; i++) {
				if (givenInput % i ==0) {
					givenInput = givenInput/i;
					System.out.println(givenInput + " * " + i);
					factors.add(i);
				}
			}
	}
}
