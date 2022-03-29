import java.math.*;

public class problemSixteen {

	public static void main(String[] args) {
		BigInteger a;
		int sum = 0;
		a = new BigInteger("2");
		BigInteger result = a.pow(1000);
		System.out.println(result);
		String resultString = result.toString();
		System.out.println(resultString);
		for (int i=0; i < resultString.length(); i++) {
			int testingInt = Character.getNumericValue(resultString.charAt(i));
			System.out.println(testingInt);
			sum += testingInt;
		}
		System.out.println(sum);
	}

}
