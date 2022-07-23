package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeIn {

	
	public static void main(String[] args) {
		
		// arraylist d'entier 
		ArrayList<Integer>listes = new ArrayList<>();
		listes.add(-1);
		listes.add(5);
		listes.add(7);
		listes.add(3);
		listes.add(-2);
		listes.add(4);
		listes.add(8);
		listes.add(5);
		
		// affichons tous les elements de liste
		
		System.out.println(listes.toString());
		
		// La taille de la liste 
		 
		System.out.println("La taille de l'ArrayList est: "+ listes.size());
		
		// Recherchez et affichez le plus grand élément de la liste

		 Integer val = Collections.max(listes);
		    System.out.println(val);
		    
		    listes.remove(Collections.min(listes));
		    
		   System.out.println(listes);
		   
		   listes.set(-1 , 10);
		   listes.set(-2, 11);
		   
		   System.out.println(val);
		    
	}

}
