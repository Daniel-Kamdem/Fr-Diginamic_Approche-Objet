import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CreationManipulationMap {

	public static void main(String args[]) {
		
		HashMap<Integer, String> mapVilles= new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		// Set<Integer> keys = mapVilles.keySet();
		
		// boucle exo 2 TP 
			
		for (Integer key: mapVilles.keySet()) {
				System.out.println(key);
				
				for (String ville: mapVilles.values())
					System.out.println(ville);
				
		System.out.println("Taille après ajout des éléments: " + mapVilles.size());
			}
	}
}

	

