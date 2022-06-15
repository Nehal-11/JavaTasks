package Task9thMay;

import java.util.*;

public class ListDifference {
	List<String> array = new ArrayList<String>();

	void arrayList() {
		System.out.println("Array List");

		array.add("thor");
		array.add("batman");
		array.add("iron man");
		Iterator it = array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();

	}

	void arrayMethods() {
		System.out.println("For each loop");

		for (String str : array) {
			System.out.println(str);
		}

		array.add(0, "vision");
		array.add(1, "america");
		array.add(2, "vanda");
		array.add(3, "groot");
		array.add(4, "vision");
		System.out.println(array);
		
		
		List<String> array2 = new ArrayList<String>();
		array2.add("strange");
		array2.add("hulk");
		array2.addAll(array);
		System.out.println(array);
		//retain
		array.retainAll(array);
		System.out.println(array);
		 array.replaceAll(e -> e.toUpperCase());
		 System.out.println(array);
		 
		
	}

	
	  void linkedList() { 
		  List<String> array = new LinkedList<String>();
	  System.out.println("Linked List"); array.add("cap"); array.add("groot");
	  array.add("vision"); Iterator it1 = array.iterator(); while(it1.hasNext()) {
	  System.out.println(it1.next()); } }
	 
}
