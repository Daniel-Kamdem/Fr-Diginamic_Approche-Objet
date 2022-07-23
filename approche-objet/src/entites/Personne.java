package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;

	public Personne(String name, String FirstName) {

		nom = name;
		prenom = FirstName;
	}

	public Personne(String name, String firstName, AdressePostale post) {

		nom = name;
		prenom = firstName;

		// Personne p = new Personne("KAMDEM", "daniel");

	}
	
	public void afficherIdentite(){
	
			System.out.println(nom + " " + prenom);
			
			
	}
	
	public void setNom( String name) {
		
		nom = name;
	}
}
