import java.math.BigInteger;
import java.util.ArrayList;

public class problemTwenty {

	public static void main(String[] args) {
		int n = 100;
		BigInteger factorial;
		int factorialAdd = 0;
		factorial = BigInteger.valueOf(n);
		for (int i=1; i<n; i++) {
			System.out.println(i);
			int fsad=n-i;		
			factorial = factorial.multiply(BigInteger.valueOf(fsad));
			System.out.println(factorial);
		}
		String facString = factorial.toString();
		System.out.println(facString);
		for (int i=0; i<facString.length(); i++) {
			factorialAdd += Character.getNumericValue(facString.charAt(i));
			System.out.println(factorialAdd);
		}
	}

}
