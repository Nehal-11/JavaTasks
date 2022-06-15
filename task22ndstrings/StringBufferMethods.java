package task22ndstrings;

public class StringBufferMethods {
	void bufferMethods() {

		StringBuffer append = new StringBuffer("Hi this is Mr.Bean");
		append.append(" ,I am animated");
		System.out.println("Append:" + " " + append);

		StringBuffer insert = new StringBuffer("Mr ben");
		insert.insert(5, "a");
		System.out.println("Inserting: " + " " + insert);

		StringBuffer replace = new StringBuffer("I am animated");
		replace.replace(4, 5, " not ");
		System.out.println("Replace: " + " " + replace);

		StringBuffer delete = new StringBuffer("Bean Rowan sebastian");
		delete.delete(0, 4);
		System.out.println("Delete:" + " " + delete);

		StringBuffer reverse = new StringBuffer("lahen");
		reverse.reverse();
		System.out.println("Reverse:" + " " + reverse);

	
		
		/*StringBuffer capacity = new StringBuffer();
		capacity.append("Atmecs");
		System.out.println("Capacity:" + " " + capacity.capacity());
		capacity.append("Technological");
		System.out.println("Capacity:" + " " + capacity.capacity());

		StringBuffer ensureCapacity = new StringBuffer();
		ensureCapacity.append("Animation");
		ensureCapacity.append("Kids TV show");
		ensureCapacity.ensureCapacity(50);
		System.out.println("Ensure Capacity:" + " " + ensureCapacity.capacity());*/
	}
}
