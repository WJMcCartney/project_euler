
public class problemFour {

	public static void main(String[] args) {
		int largestPalindrome = 0;
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int testCase = i * j;
				String testCaseS = String.valueOf(testCase);
				StringBuffer testCaseSBuffer = new StringBuffer(testCaseS);
				testCaseSBuffer.reverse();
				String secondCase = testCaseSBuffer.toString();
				if (testCaseS.equals(secondCase)) {
					if (testCase > largestPalindrome) {
						largestPalindrome = testCase;
					}
				}
				System.out.println(largestPalindrome);
			}
		}

	}

}
