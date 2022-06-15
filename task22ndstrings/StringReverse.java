package task22ndstrings;

public class StringReverse {

	String name1= "nehal";
	String reverse = "";

	/*public StringReverse(String name1) {
		// TODO Auto-generated constructor stub
		this.name1 = name1;

	}*/

	void strRev() {

		for (int charIndex = name1.length() - 1; charIndex >= 0; charIndex--) {
			reverse = reverse + name1.charAt(charIndex);
		}
		System.out.println("reverse is:" + reverse);

	}
}
