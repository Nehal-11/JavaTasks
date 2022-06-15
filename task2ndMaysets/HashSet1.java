package task2ndMaysets;
import java.util.*;    
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;  
public class HashSet1 {
void retain() {
		Set <String> name1 = new TreeSet();
		Integer[]A = {100,234,890,567,893};
		Integer[]B = {345,100,893,200,250};
		name1.retainAll(name1);
		System.out.println("retain invoked: " +name1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set=new HashSet();  
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Five");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        {  
        System.out.println(i.next());  
        }    
	HashSet1 hash = new HashSet1();
	hash.retain();
	
	}

}
