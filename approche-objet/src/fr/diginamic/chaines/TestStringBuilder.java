package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long debut= System.currentTimeMillis();
		
		//concaténé 
		
		StringBuilder a = new StringBuilder();
		
		String b = " ";
		for ( int i = 1; i<=100000; i++) {
			
			//a.append(i);
			b=b+i;
			
		}
		
		
		// Code àchronométrer
		
		long fin= System.currentTimeMillis();
		System.out.println("Temps écouléen millisecondes :"+ (fin-debut));
		
		// System.out.println(a);
		
		
	}

}
