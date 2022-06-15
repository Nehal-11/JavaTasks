package task14thApril;

import java.util.Scanner;

public class GenerateRandom {
	int answer;

	int generateNumber(int minimum, int maximum) {

		answer = (int) (Math.random() * (maximum - minimum + 1) + minimum);
		// System.out.println(answer);
		return answer;

	}

	void checkNumber() {

		Scanner scan = new Scanner(System.in);

		int guess;

		boolean correct = false;

		while (!correct) {

			System.out.println("Enter a number between 1 and 30: ");

			guess = scan.nextInt();
			if (guess > 30 || guess < 1) {
				System.out.println("enter valid input!");
			} else {
				if (guess > answer) {
					System.out.println("The entered number is too high, try again");
				}

				else if (guess < answer) {
					System.out.println("The numbered number is too low, try again");
				}

				else {

					System.out.println("Yes, guessed number is correct.");

					correct = true;
				}
			}
		}
		System.exit(0);
	}
}
