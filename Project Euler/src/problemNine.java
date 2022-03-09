import java.util.*;
import java.lang.*;

public class problemNine {

	public static void main(String[] args) {
		first: for (int i = 1; i < 1000; i++) {
			for (int j = 1; j < 1000; j++) {
				double aSquared = i * i;
				double bSquared = j * j;
				double c = aSquared + bSquared;
				double cSquared = Math.sqrt(c);
				String cString = String.valueOf(c);
				String cSquaredString = String.valueOf(cSquared);
				// System.out.println(cSquaredString.length());
				if (cSquaredString.length() <= 6) {
					System.out.println(i + "^2 + " + j + "^2 = " + cSquaredString + "^2");
					double total = i + j + cSquared;
					if (total == 1000) {
						System.out.println("found the answer");
						System.out.println(i*j*cSquared);
						break first;
					}
				}
			}
		}
		System.exit(0);
	}

}
