import java.util.*;
import java.lang.reflect.Array;

public class problemSix {

	public static void main(String[] args) {
		int n = 99999999;
		int counter = 0;
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
				counter++;
				System.out.println(counter);
				if (counter == 10001) {
					System.out.println(i);
					break;
				}
			}

		}

	}

}