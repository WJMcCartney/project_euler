
public class problemFourteen {

	public static void main(String[] args) {
		double n;
		int highestCount = 1;
		double highestN = 0;
		for (n = 1; n < 999999; n++) {
			int count = 1;
			//System.out.println("NEW NUMBER HERE" + n);
			double p = n;
			while (p != 1.0) {
				if (p % 2 == 0) {
					p = p / 2;
				} else {
					p = (3 * p) + 1;
				}
				count++;
				//System.out.println(count + " " + p);
				if (count > highestCount) {
					highestCount = count;
					highestN = n;
				}
			}
		}
		System.out.println("The starting number amount is " + highestN + " with a count of " + highestCount);
	}

}
