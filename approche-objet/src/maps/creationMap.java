package maps;

import java.util.HashMap;


public class creationMap {

	public static void main(String[] args) {
		
		 HashMap<Integer , String> mapSalaires = new HashMap<>();
	        mapSalaires.put( 1750, "paul");
	        mapSalaires.put(1825, "hicham");
	        mapSalaires.put(2225, "Yu");
	        mapSalaires.put(2015, "Ingrid");
	        mapSalaires.put(2418, "Chantal");
	       
	        // System.out.println(mapSalaires);
	        
	        System.out.println("Taille après ajout des éléments: " + mapSalaires.size());
	        
	        
	
	        
	    }
		
	}

