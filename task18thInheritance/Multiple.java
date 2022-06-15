package task18thInheritance;

interface TV {
	void display();
}

interface Sports {
	void show();
}

interface Cricket extends TV, Sports {
	void play();
}

public class Multiple {

	public static void main(String[] args) {

		Cricket oCricket = new Cricket() {

			@Override
			public void show() {

				System.out.println("Select sports channel");
			}

			@Override
			public void display() {

				System.out.println("Switch on TV");
			}

			@Override
			public void play() {

				System.out.println("Watch cricket match");
			}
		};
		oCricket.display();
		oCricket.show();
		oCricket.play();
	}

}
