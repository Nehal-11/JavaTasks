package task26arrays;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class ArraySorter {
	int[] tempVar;
	DataStorage oData = new DataStorage();
	Scanner scan = new Scanner(System.in);

	void getTheArrayElements() {

		System.out.println("Enter the length of the array");
		try {
			oData.setLengthOfTheArray(scan.nextInt());

		} catch (InputMismatchException exe1) {
			System.err.println(exe1 + " " + "Enter only integer!");
			// System.exit(0);
		}

		System.out.println("Enter unsorted array: ");

		int[] temp = new int[oData.getLengthOfTheArray()];
		try {
			for (int charIndex = 0; charIndex < temp.length; charIndex++) {

				temp[charIndex] = scan.nextInt();
System.out.println("The unsorted array is: " + temp[charIndex]);
			}

		} catch (Exception exe2) {
			System.err.println(exe2 + " " + "Invalid input, try again!");
			// System.exit(0);

		}
		
		oData.setUnsortedArray(temp);
		scan.close();

	}

	void sortTheArrayInAscendingOrder() {
		tempVar = oData.getUnsortedArray();
		for (int firstIndex = 0; firstIndex < tempVar.length; firstIndex++) {

			int tempVarStore;
			for (int secondIndex = firstIndex + 1; secondIndex < tempVar.length; secondIndex++) { 
				if (tempVar[firstIndex] > tempVar[secondIndex]) { //firstindex - i, sencondindex - j
					tempVarStore = tempVar[firstIndex];
					tempVar[firstIndex] = tempVar[secondIndex];
					tempVar[secondIndex] = tempVarStore;
				}

			}
		}
		oData.setArraySortedInAscendingOrder(tempVar);
	}

	void displayTheArraySortedInAscendingOrder() {
		System.out.print("Array after sorting in Ascending Order: ");
		tempVar = oData.getArraySortedInAscendingOrder();
		for (int index = 0; index < tempVar.length; index++) {

			System.out.print(tempVar[index] + " ");
		}
	}

	void sortTheArrayInDescendingOrder() {
		tempVar = oData.getUnsortedArray();
		for (int firstIndex = 0; firstIndex < tempVar.length; firstIndex++) {

			int tempStored;
			for (int secondIndex = firstIndex + 1; secondIndex < tempVar.length; secondIndex++) {
				if (tempVar[firstIndex] < tempVar[secondIndex]) {
					tempStored = tempVar[firstIndex];
					tempVar[firstIndex] = tempVar[secondIndex];
					tempVar[secondIndex] = tempStored;
				}

			}
		}
		oData.setArraySortedInDescendingOrder(tempVar);
	}

	void displayTheArraySortedInDescendingOrder() {
		System.out.println();
		System.out.print("Array after sorting in Descending Order: ");
		tempVar = oData.getArraySortedInDescendingOrder();
		for (int charIndex = 0; charIndex < tempVar.length; charIndex++) {

			System.out.print(tempVar[charIndex] + " ");
		}

	}
}
