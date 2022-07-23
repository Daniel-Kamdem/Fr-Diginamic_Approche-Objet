package listes;

import java.util.ArrayList;
import java.util.List;

public class FusionListe {

	public static void main(String args[]) {

		List<String> liste1 = new ArrayList<String>();

		liste1.add("Rouge");

		liste1.add("Vert");

		liste1.add("Orange");

		
		List<String> liste2 = new ArrayList<String>();

		liste2.add("Blanc");

		liste2.add("Bleu");

		liste2.add("Orange");
		
		List<String> liste3 = new ArrayList<String>();
		

	        liste3.add("Vert");
	        liste3.add("Bleu");
	        liste3.add("Orange");   
	        liste3.add("Blanc");
	        liste3.add("Rouge");


	        for (String couleur : liste3) {
	            
	        	System.out.println(liste3);
	        	
	        }

}
}
