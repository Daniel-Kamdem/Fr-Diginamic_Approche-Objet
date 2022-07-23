package entites;

public class TestPersonne {

	public static void main(String[] args) {

//		AdressePostale ap = new AdressePostale();

		AdressePostale ap = new AdressePostale(5, "rue dia", 34000, "Montpellier");
//		ap.numeroRue = 5; 
//		ap.libelleRue = "rue dia";
//		ap.codePostal = 34000;
//		ap.ville = "Montpellier"; 

		Personne pe = new Personne("kamdem", "daniel", ap);

//		pe.nom = "kamdem";
//		pe.prenom = "daniel";
//		pe.adresse = ap;

		pe.afficherIdentite();
		pe.setNom("a");
		pe.afficherIdentite();

	}

}
