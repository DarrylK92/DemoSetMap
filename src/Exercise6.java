import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<Integer, Integer> map = new HashMap<>();
		
		int value;
		System.out.println("Enter values: ");
		
		//Runs till user enters a 0
		do {
			//Get input from user
			value = input.nextInt();
			
			if (value != 0) {
				//Check if key already exists in map
				if (map.containsKey(value)) {
					//Add 1 to existing key
					map.put(value, map.get(value) + 1);
				} else {
					//Add new key to map
					map.put(value, 1);
				}
			}
			
		}while(value != 0);
		
		//Close input
		input.close();
		
		//Find highest value
		int highest = 0;
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			if (e.getValue() > highest) {
				highest = e.getValue();
				
			}
		}
		
		//Display keys with highest value
		System.out.println("Most occurances: ");
		for(Map.Entry<Integer, Integer> e: map.entrySet()) {
			if (e.getValue() == highest) {
				System.out.println(e.getKey());
			}
		}
	}

}
