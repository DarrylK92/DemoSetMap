import java.util.LinkedHashSet;
import java.util.Set;

public class Exercise1 {

	public static void main(String[] args) {
		//Create first set
		Set<String> set1 = new LinkedHashSet<String>();
		
		//Add values
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");
		
		//Create second set
		Set<String> set2 = new LinkedHashSet<String>();
		
		//Add values
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");
		
		//Create sets for resetting set1
		Set<String> set3 = new LinkedHashSet<String>(set1);
		Set<String> set4 = new LinkedHashSet<String>(set1);
		//Create set for resetting set2
		Set<String> set5 = new LinkedHashSet<String>(set2);
		
		//Union
		set1.addAll(set2);
		System.out.println("Union: " + set1);
		
		set1 = set3; //Reset set1
		
		//Difference
		set1.removeAll(set2);
		System.out.println("Difference: set1 : " + set1);
		set1 = set4; //Reset set1
		set2.removeAll(set1);
		System.out.println("Difference: set2 : " + set2);
		
		set2 = set5; //Reset set2
		
		//Intersection
		set1.retainAll(set2);
		System.out.println("Intersection: " + set1);
	}

}
