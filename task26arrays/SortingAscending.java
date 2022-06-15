package task26arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortingAscending {

boolean run = true;	
int[] temp;
Scanner scan = new Scanner(System.in);
Sorting sort = new Sorting();
void getTheArrayElements() {

	System.out.println("Enter the length of the array");
	try {
		sort.setLengthOfTheArray(scan.nextInt());

	} catch (InputMismatchException e) {
		System.err.println("Enter only integer!");
		//System.exit(0);
	}

	System.out.println("Enter unsorted array: "); 

	int[] temp = new int[sort.getLengthOfTheArray()];
	try {
		for (int charIndex = 0; charIndex < temp.length; charIndex++) {

			temp[charIndex] = scan.nextInt();

		}

	} catch (Exception e) {
		System.err.println(e +" " + "Invalid input, try again!");
		//System.exit(0);
	
	}
	
   while(!run) {
	   for (int charIndex = 0; charIndex < temp.length; charIndex++) {

			temp[charIndex] = scan.nextInt();
   }
	sort.setUnsortedArray(temp);
	scan.close();
   }
}

void sortTheArrayInAscendingOrder() {
	temp = sort.getUnsortedArray();
	for (int i = 0; i < temp.length; i++) {

		int tempVarStore;
		for (int j = i + 1; j < temp.length; j++) {
			if (temp[i] > temp[j]) {
				tempVarStore = temp[i];
				temp[i] = temp[j];
				temp[j] = tempVarStore;
			}

		}
	}
	sort.setArraySortedInAscendingOrder(temp);
}

void displayTheArraySortedInAscendingOrder() {
	System.out.print("Array after sorting in Ascending Order: ");
	temp = sort.getArraySortedInAscendingOrder();
	for (int index = 0; index < temp.length; index++) {

		System.out.print(temp[index] + " ");
	}
}
public static void main(String[] args) {
	SortingAscending sort1 = new SortingAscending();
	sort1.getTheArrayElements();
	sort1.sortTheArrayInAscendingOrder();
	sort1.displayTheArraySortedInAscendingOrder();
}
}



