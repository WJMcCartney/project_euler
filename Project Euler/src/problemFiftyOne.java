import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class problemFiftyOne {

	public static void main(String[] args) {
		double[] factors = { 0, 0, 0, 0, 0, 0 };
		int[] placeholder = { 0, 1, 2, 3, 4, 5 };
		int n = 0;
		// rather than hard coding, add the arrays to a hashmap
		// for (int u = n; u <= 9; u++) {
		// Array.set(factors, placeholder[7], (double) u);
		// for (int x = n; x <= 9; x++) {
		// Array.set(factors, placeholder[0], (double) x);
		for (int y = 1; y <= 1; y++) {
			Array.set(factors, placeholder[0], (double) y);
			first: for (int i = 1; i <= 2; i++) {
				Array.set(factors, placeholder[1], (double) i);
				second: for (int j = n; j <= 9; j++) {
					Array.set(factors, placeholder[3], (double) j);
					third: for (int k = n; k <= 9; k++) {
						Array.set(factors, placeholder[5], (double) k);
						int primeCounter = 0;
						fourth: for (int l = n; l <= 9; l++) {
							Array.set(factors, placeholder[2], (double) l);
							Array.set(factors, placeholder[4], (double) l);
							int factor = 0;
							for (int m = 0; m <= factors.length - 1; m++) {
								factor += factors[m] * (Math.pow(10, (double) (factors.length - m)));
							}
							factor = factor / 10;
							System.out.println(factor);
							int digitSum = 0;
							for (int m = 0; m < factors.length; m++) {
								digitSum += factors[m];
							}
							System.out.println(digitSum);
							if (factor % 2 == 0 || digitSum % 3 == 0) {
								continue;
							} else {
								primeCounter++;
							}
							System.out.println(primeCounter);
							if (primeCounter > 7) {
								System.out.println(Arrays.toString(factors));
								System.out.println(factor);
								System.out.println(primeCounter + " PRIME COUNTER");
								System.exit(0);
							}
						}

					}
				}
			}

		}
	}
}
// }
//}
