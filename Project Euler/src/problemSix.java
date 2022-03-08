
public class problemSix {

	public static void main(String[] args) {
		int sum=0;
		int squareSum =0;
		for (int i=0; i<=100; i++) {
			sum += i;
			squareSum = i*i + squareSum;
			System.out.println(sum);
			System.out.println(squareSum);
		}
		sum = sum * sum;
		System.out.println(sum);
		int finalAnswer = squareSum - sum;
		System.out.println(finalAnswer);
	}

}
