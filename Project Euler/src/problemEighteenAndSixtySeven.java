import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

public class problemEighteenAndSixtySeven {

	public static void main(String[] args) {
		int optionOne = 0;
		int optionTwo = 0;
		int currentValue = 0;
		ArrayList[][] newMap = new ArrayList[15][15];
		int[][] inputs = { { 75 }, { 95, 64 }, { 17, 47, 82 }, { 18, 35, 87, 10 }, { 20, 04, 82, 47, 65 },
				{ 19, 01, 23, 75, 03, 34 }, { 88, 02, 77, 73, 07, 63, 67 }, { 99, 65, 04, 28, 06, 16, 70, 92 },
				{ 41, 41, 26, 56, 83, 40, 80, 70, 33 }, { 41, 48, 72, 33, 47, 32, 37, 16, 94, 29 },
				{ 53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14 }, { 70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57 },
				{ 91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48 },
				{ 63, 66, 04, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31 },
				{ 04, 62, 98, 27, 23, 9, 70, 98, 73, 93, 38, 53, 60, 04, 23 } };
		// canvas c = new canvas();
		System.out.println(Arrays.deepToString(inputs));
		for (int i = 0; i < inputs.length; i++) {
			System.out.println();
			for (int j = 0; j < inputs[i].length; j++) {
				System.out.print(inputs[i][j] + " ");
			}
		}
		System.out.println();
		for (int i = inputs.length - 1; i > 0; i--) {
			for (int j = 0; j < inputs[i].length - 1; j++) {
				int currentElement = j + 1;
				int nextElement = i - 1;

				optionOne = inputs[i][j];
				if (j != inputs[i].length) {
					optionTwo = inputs[i][currentElement];
				}
				if (i != 0) {
					currentValue = inputs[nextElement][j];
				}
				// System.out.println(currentValue + " " + optionOne + " and " + optionTwo);
				if (optionOne > optionTwo) {
					// System.out.println("option one " + optionOne);
					newMap[i][j] = new ArrayList();
					newMap[i][j].add(optionOne);
				} else if (optionTwo > optionOne) {
					// System.out.println("option two " + optionTwo);
					newMap[i][j] = new ArrayList();
					newMap[i][j].add(optionTwo);

				}
				System.out.println(newMap[i][j]);
			}

		}
		for (int i = 0; i < inputs.length; i++) {
			System.out.println();
			for (int p = 0; p < inputs[i].length; p++) {
				System.out.print(inputs[i][p]);
				for (int j = 0; j < inputs[i].length; j++) {
					
					if (newMap != null) {
						System.out.print(newMap[i][j]);
					}
				}
			}
		}

	}

}
