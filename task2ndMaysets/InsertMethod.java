package task2ndMaysets;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;
public class InsertMethod {
void hash() {
	HashSet<String> set = new HashSet<>();
set.add("Cognizant");
set.add("Wells fargo");
set.add("Capgemini");
set.add("tcs");
set.add("KPMG");
System.out.println("*HASH SET*");
System.out.println();
System.out.println("Top MNC: ");
for(String string1 : set) {
	
	System.out.println(string1);
}
System.out.println();
Hashtable<String, Integer> list = new Hashtable<String, Integer>();
}
void linkHash() {
	LinkedHashSet<Object> set1 = new LinkedHashSet<>();
	set1.add("Cognizant");
	set1.add("Wells fargo");
	set1.add("Capgemini");
	set1.add("tcs");
	set1.add("Wells fargo");
	set1.add("KPMG");
	System.out.println("*LINKEDHASH SET*");
	System.out.println();
	System.out.println("Top MNC: " +set1);
	System.out.println();
	LinkedList<Object> list = new LinkedList<Object>(set1);
	System.out.println(list);
	System.out.println();
	
}
void treeSet() {
	Set<String> set = new TreeSet<String>();
	set.add("Vivan");
	set.add("Dimple");
	set.add("Bala");
	set.add("Karthi");
	set.add("Arti");
	System.out.println("*TREE SET*");
	System.out.println();
	System.out.println(set);
}
}
