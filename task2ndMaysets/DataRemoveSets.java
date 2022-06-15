package task2ndMaysets;

import java.util.HashSet;
import java.util.Set;

public class DataRemoveSets {
	Set<String> set = new HashSet<String>();

	void dataRemove() {

		set.add("anjana");
		set.add("alan");
		set.add("nidhi");
		set.add("bary");
		set.add("kishan");
		System.out.println("Initially added elements are: " + set);
		System.out.println();
		// removing one specific element
		set.remove("bary");
		System.out.println("After removing specific element: " + set);
		System.out.println();

	}

	void dataRemoveAll() {
		
		set.add("ajay");
		set.add("viji");
		set.addAll(set);
		System.out.println("Adding new elements: " + set);
		System.out.println();
		// removing all
		set.removeAll(set);
		System.out.println("after remove all: " + set);
		System.out.println();
	}
	Set<String> set2 = new HashSet<String>();
	void removeIf() {
		Set<String> set2 = new HashSet<String>();
		set2.add("anjan");
		set2.add("alvin");
		set2.add("vidhi");
		set2.add("harry");
		set2.add("kiara");
		System.out.println("new set of elements: " + set2);
		System.out.println();
		set2.removeIf(str -> str.contains("anjan"));
		System.out.println("after invoking remove if: " + set2);
		System.out.println();
		set2.addAll(set);
		System.out.println("adding all: " +set2);
	}

	void clearMethod() {
		set2.clear();
		set.clear();
		System.out.println("invoked clear method:" + set + set2);
	}
}
