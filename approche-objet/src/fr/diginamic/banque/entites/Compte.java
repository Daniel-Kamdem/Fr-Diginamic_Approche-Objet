package fr.diginamic.banque.entites;

public class Compte {

	protected String numero;
	protected double solde;
	
	public Compte(String numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
		
	
				
		}
	
	
	public String toString() {
		return "-->" + numero + " " + solde; 
		
	}
	public String getNumero() { 
		return numero;
		
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
		
		System.out.println();
	}
	
	
}
