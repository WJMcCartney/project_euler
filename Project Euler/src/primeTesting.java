import java.util.*;
import java.lang.reflect.Array;

public class primeTesting {

	public static void main(String[] args) {
		int none = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int n = 999999;
		int[] arrPS = { 0, 0, 0, 0, 0, 0 };
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++) {
			prime[i] = true;
		}
		for (int p = 2; p * p <= n; p++) {
			if (prime[p] == true) {
				for (int i = p * p; i <= n; i += p)
					prime[i] = false;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (prime[i] == true) {
				System.out.println(i);
				}
				/*
				 * Arrays.sort(arrPS); System.out.println(Arrays.toString(arrPS)); if (arrPS[0]
				 * == arrPS[5]) { six++; } else if (arrPS[0] == arrPS[4]) { five++; } else if
				 * (arrPS[0] == arrPS[3]) { four++; } else if (arrPS[0] == arrPS[2]) { three++;
				 * } else if (arrPS[0] == arrPS[1]) { two++; } else { none++; }
				 */
			}

		}

	}


