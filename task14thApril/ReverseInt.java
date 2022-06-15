package task14thApril;

public class ReverseInt {

	public void IntegerRev(int number) {
		int reversenum = 0;
		while (number != 0) {
			int rem = number % 10;

			reversenum = reversenum * 10 + rem;

			number = number / 10;
		}
		System.out.println("the reverse of given integer is: " + reversenum);
	}

}
