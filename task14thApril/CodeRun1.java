package task14thApril;

import java.util.Scanner;

public class CodeRun1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInt oReverse = new ReverseInt();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number to reverse: ");
		int number = scan.nextInt();
		
		oReverse.IntegerRev(number);
	}

}
