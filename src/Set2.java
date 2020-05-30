import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Set2 {

	public static void main(String[] args) {
		Person p1 = new Person(0, "Kevin");
		Person p2 = new Person(1, "Peter");
		Person p3 = new Person(2, "Ryan");
		Person p4 = new Person(3, "Veronica");
		Person p5 = new Person(0, "Kevin");
		
		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();
		map.put(p1, 1000);
		map.put(p2, 2000);
		map.put(p3, 3000);
		map.put(p4, 4000);
		map.put(p5, 5000);
		System.out.println(map);
		
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		set.add(p5);
		System.out.println(set);
	}

}

class Person {
	private int id;
	private String name;
	
	public Person(int i, String s) {
		id = i;
		name = s;
	}
	
	public String toString() {
		return "[" + id + " : " + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}