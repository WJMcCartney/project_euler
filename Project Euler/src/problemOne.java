import java.util.ArrayList;

public class problemOne {

	public static void main(String[] args) {
		int sum =0;
		ArrayList<Integer> multiples = new ArrayList<Integer>();
		for (int i=0; i<1000; i++) {
			System.out.println(i);
			if (i%3==0 || i%5==0) {
				multiples.add(i);
			}
		}
		for (int i=0; i<multiples.size();i++) {
			sum += multiples.get(i);
		}
		System.out.println(multiples);
		System.out.println(sum);
	}

}
//flex blocks