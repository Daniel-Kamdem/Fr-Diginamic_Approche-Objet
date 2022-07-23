package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		
		// Création 
		HashMap<Integer, String> map1= new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		
		// Création map2
		
		HashMap<Integer, String> map2= new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");
		
		// creation map3
		
		System.out.println("HashMap1: " + map1.toString());

		System.out.println("HashMap2: " + map2.toString());


			map2.forEach((key, value)-> map1.merge(key,value,
	         (v1, v2)
	             -> v1.equalsIgnoreCase(v2)
	                    ? v1
	                    : v1 + ", " + v2));
	
	
			System.out.println("New HashMap: " + map1);
}

		

	}


