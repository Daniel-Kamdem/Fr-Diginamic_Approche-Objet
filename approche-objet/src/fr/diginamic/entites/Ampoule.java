package fr.diginamic.entites;

public class Ampoule {

	
	private boolean allume;

	public Ampoule() {

		// this.allume = false;

	}

	public void clic() {
	  
		// utilisé la commande clic 
	
		if (allume) {
			System.out.println(allume);
		this.allume = false;
		}
	
		else {
			System.out.println(allume);
		this.allume = true;
		}
		
	 
	}
	
	public String toString() {
		return "Eteinte"  false;
		
	}

}
