package Task5thMayjavaMaps;

import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Inserting {

	void insertHash() {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("one", 1);
		map1.put("two", 2);
		map1.put("three", 3);
		map1.put("four", 4);
		map1.put("five", 5);
		System.out.println("HASH MAP");
		System.out.println("Initial elements: " + map1);

		// printing size of map
		System.out.println("showing map size: " + map1.size());
		// to check if given key is present
		if (map1.containsKey("five")) {
			Integer a1 = map1.get("five");
			System.out.println("value for given key is:- " + a1);

			System.out.println(map1.containsValue(4));
			// keyset, entryset, values
			System.out.println(map1.keySet());
			System.out.println(map1.entrySet());
			System.out.println(map1.values());
			System.out.println();
		}

	}

	void insertLinkedhash() {
		int number = 0;
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("LINKEDHASH MAP");
		System.out.println("enter the size: ");

		try {
			number = scan.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("enter integer value");
		}
		for (int index = 0; index < number; index++) {

			System.out.println("enter the list: ");
			map2.put(scan.next(), scan.nextInt());

		}
		System.out.println(map2);
		System.out.println();
		System.out.println("Using iterator");
		for (Map.Entry<String, Integer> entry : map2.entrySet()) { // using for map to iterate
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("key: " + entry.getKey());
			System.out.println("value: " + entry.getValue());

		}
		System.out.println("final value: " + map2.entrySet());
		System.out.println();
	}

	void insertTree() {
		TreeMap<Integer, Integer> tree = new TreeMap<Integer, Integer>(Collections.reverseOrder());
		tree.put(2, 20);
		tree.put(3, 30);
		tree.put(4, 40);
		tree.put(5, 50);
		tree.put(6, 60);

		System.out.println("TREE MAP");
		System.out.println(tree);

	}
}
