import java.util.*;
import java.lang.*;
import java.io.*;

public class problemTwelve {

	static int divCount(int n) {
		int modCheck = n % 20;
		int total = 1;
		if (modCheck == 0) {
			boolean trueFalseArray[] = new boolean[n + 1];
			Arrays.fill(trueFalseArray, true);
			for (int p = 2; p * p < n; p++) {
				if (trueFalseArray[p] == true) {
					for (int i = p * 2; i < n; i += p) {
						trueFalseArray[i] = false;
					}
				}
			}

			for (int p = 2; p <= n; p++) {
				if (trueFalseArray[p]) {
					int count = 0;
					if (n % p == 0) {
						while (n % p == 0) {
							n = n / p;
							count++;
						}
						total = total * (count + 1);
					}
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		int n = 0;
		for (int t = 1; t < 99999999L; t++) {
			n = t + n;
			if (divCount(n) >= 300) {
				System.out.println(n + " " + divCount(n));
			}
			if (divCount(n) >= 500) {
				System.out.println(divCount(n));
				System.out.println("FOUND IT");
				break;
			}
		}
	}
}
