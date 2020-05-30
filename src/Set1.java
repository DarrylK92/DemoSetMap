import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		
		set1.add("dog");
		set1.add("cat");
		set1.add("monkey");
		set1.add("dog");
		set1.add("horse");
		set1.add("parrot");
		
		//linked hash set: in order
		Set<String> set2 = new LinkedHashSet<String>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("monkey");
		set2.add("dog");
		set2.add("horse");
		set2.add("parrot");
		
		//tree set: natural order
		Set<String> set3 = new TreeSet<String>();
		
		set3.add("dog");
		set3.add("cat");
		set3.add("monkey");
		set3.add("dog");
		set3.add("horse");
		set3.add("parrot");
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		for (String e: set1) {
			System.out.print(e + " ");
		}
		System.out.println();
		
		//lambda for each
		set1.forEach(e -> System.out.print(e.toLowerCase() + " "));
		System.out.println();
		
		if (set1.contains("snake")) {
			System.out.println("Snake is in the set");
		} else if (set1.contains("monkey")) {
			System.out.println("Monkey is in the set");
		}
		
		set1.remove("monkey");
		set1.remove("parrot");
		System.out.println(set1);
		
		
		set2.removeAll(set1);
		System.out.println(set2);
		
		set1.add("snake");
		set2.addAll(set1);
		System.out.println(set2);
		
		if (set2.containsAll(set1)) {
			System.out.println("contains all");
		}
		
		System.out.println(set1); //set1 should have something set2 doesn't to properly demonstrate this
		System.out.println(set2);
		set2.retainAll(set1);
		System.out.println(set2);
		
		
	}

}
