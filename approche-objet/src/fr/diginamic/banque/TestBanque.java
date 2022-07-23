package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux; 

public class TestBanque {
	
	public static void main(String[] args) {
		Compte cpt = new Compte("A00015654G", 15245.5);
		//System.out.println(cpt);
		CompteTaux tx = new CompteTaux("BOOO40", 10000, 15);
	
		Compte[] comptes = {cpt,tx}; 
		
		System.out.println(comptes[0]);
		
		for(int i = 0; i < comptes.length; i++ ) { 
			System.out.println(comptes[i]);
			
			
		}
		
		
	}
	
}