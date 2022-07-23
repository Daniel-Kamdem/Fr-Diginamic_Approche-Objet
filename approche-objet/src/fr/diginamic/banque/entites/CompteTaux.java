package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	// private String numero;
	// private double solde;
	private double remuneration;

	public CompteTaux(String numero, double solde, double remuneration) {
		super(numero, solde);
		// this.numero = numero;
		// this.solde = solde;
		this.remuneration = remuneration;

	}

	public String toString() {
		return "-->" + numero + " " + solde + " " + remuneration;
		

	}

}
