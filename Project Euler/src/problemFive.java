import java.util.*;
import java.lang.*;

public class problemFive {

	public static void main(String[] args) {
		long testValue = 99999999999L;
		int range = 20;
		int rangeSize = range-1;
		first: for (int i = 1; i <= testValue; i++) {
			//System.out.print(i);
			int counter = 0;
			second: for (int j = 1; j < range; j++) {

				int test = i % j;
				//System.out.println(test);
				if (test == 0) {
					counter++;
					//System.out.println(i + "i  counter" + counter);
				} else {
					break second;
				}
				if (counter >= rangeSize) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}

	}

}
