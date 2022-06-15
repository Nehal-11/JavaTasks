
public class Obj {
	static void Revathi() {
		System.out.println("Hello Revathi");
	}

	public static void main(String[] args) {
		Revathi();
		System.out.println("Nehal");
		Sample obj1 = new Sample();
		Sample obj = new Sample(1);
		Sample obj2 = new Sample(1, 2);
		obj.Nehal(2, 3);
		obj.Nehal(4, 5);
	}
}

class Sample {
	Sample() {
		System.out.println("Dhilipan");
	}

	Sample(int x, short y) {
		System.out.println("Nehal3");
	}

	Sample(int x) {
		System.out.println("Nehal1");
	}

	Sample(int x, int y) {
		System.out.println("Nehal2");
	}

	void Nehal(int z, int a) {
		System.out.println("Hello World");

	}

	int Nehal(int x, float y) {
		return 0;
	}
}