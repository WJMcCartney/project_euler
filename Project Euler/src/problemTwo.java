import java.util.ArrayList;

public class problemTwo {

	public static void main(String[] args) {
		int originalNumber = 1;
		int additiveNumber = 1;
		int nextNumber = 1;
		int counter = 1;
		int sum = 0;
		ArrayList<Integer> evenFibNumbers = new ArrayList<Integer>();

		
		while (originalNumber < 4000001) {
			if (originalNumber % 2 == 0) {
				evenFibNumbers.add(originalNumber);
			}
			System.out.println(counter+". "+originalNumber);
			nextNumber = originalNumber + additiveNumber;
			additiveNumber = originalNumber;
			originalNumber = nextNumber;
			counter++;
		}
		System.out.println(evenFibNumbers);
		for (int i=0; i<evenFibNumbers.size(); i++) {
			sum += evenFibNumbers.get(i);
			System.out.println(i+1 + ". " +sum);
		}

	}

}
