package collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		basket.put("Item1", 1);
		basket.put("Item2", 2);
		basket.put("Item3", 3);
		basket.put("Item4", 4);
		System.out.println("The map is "+ basket);
		
		
		basket.put("Item3", 4);
		System.out.println("The map after change is "+ basket);
		
		basket.remove("Item2");
		System.out.println("The map after delete is "+ basket);
		
	/*	basket.put(null, 4);
		System.out.println("The map after adding null is "+ basket); */
		
		for(String item:basket.keySet()){
			System.out.println("The name is item "+ item);
			System.out.println("The quantity is "+ basket.get(item));
		}
		
		for(Integer val:basket.values()) {
			System.out.println("The value is "+ val);
		}
		// I am sai kiran varkala owner of the project
		// Occurrance of a string in a statement **********Imp for Interview***********
		String str = "Clean World Green World Happy World";
		String[] arr1 = str.split(" ");
		
		HashMap<String,Integer> map1 = new HashMap<String,Integer>();
		
		for(String word:arr1) {
			if(!map1.keySet().contains(word)) {
			map1.put(word, 1);
			}
			else {
				map1.put(word, map1.get(word)+1);
			}
		}
		System.out.println("The resulting output is "+ map1);
	}

}
