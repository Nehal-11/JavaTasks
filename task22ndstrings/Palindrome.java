package task22ndstrings;

public class Palindrome {
	String sentence;
	String spacing = "";

	public Palindrome(String sentence) {
		this.sentence = sentence;
	}

	void palindrome() {
		for (int charIndex = sentence.length() - 1; charIndex >= 0; charIndex--) {
			spacing = spacing + sentence.charAt(charIndex);
		}
		if (sentence.equalsIgnoreCase(spacing)) {
			System.out.println("Given sentence is a palindrome");

		} else {
			System.out.println("Not a palindrome");
		}
	}
}
