package listes;

import fichier.Ville;

public class TestEquals {

	public static void main(String[] args) {
		
		Ville ville = new Ville ("montpellier", 34, "Occitanie", 3000);
	    Ville ville1 = new Ville ("toulouse", 31, "Occitanie", 2500);
		Ville ville2 = new Ville ("bodeaux", 33, "nouvelleAquitaine", 4000);	
		
	}
		//System.out.println(ville1.equals(ville2));
		
		public boolean equals(Object obj) {
			
			if (!(obj instanceof Ville)) {
				return false;
			}
			
			Ville autre = (Ville)obj;
			return nom.equals(autre.getnom()) && nomRegion ==autre.getnomRegion() && codeDepartement.equals(autre.getcodeDepartement());
	}
}
