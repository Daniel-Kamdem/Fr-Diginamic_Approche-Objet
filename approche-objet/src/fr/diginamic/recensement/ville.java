package fr.diginamic.recensement;

 
	
	public class ville implements EnsemblePop {

		
		private String codeRegion;
	
		private String nomRegion;
		
		private String codeDepartement;
	
		private String codeVille;
		
		private String nom;
	
		private int population;


		public ville(String codeRegion, String nomRegion, String codeDepartement, String codeVille, String nom,
				int population) {
			super();
			this.codeRegion = codeRegion;
			this.nomRegion = nomRegion;
			this.codeDepartement = codeDepartement;
			this.codeVille = codeVille;
			this.nom = nom;
			this.population = population;
		}

		@Override
		public String toString() {
			return "Département n°" + codeDepartement + " - Ville : " + nom + " - " + population + " hab.";
		}

	
		public String getCodeRegion() {
			return codeRegion;
		}

		
		public void setCodeRegion(String codeRegion) {
			this.codeRegion = codeRegion;
		}

		
		public String getNomRegion() {
			return nomRegion;
		}

		public void setNomRegion(String nomRegion) {
			this.nomRegion = nomRegion;
		}

		
		public String getCodeDepartement() {
			return codeDepartement;
		}

		
		public void setCodeDepartement(String codeDepartement) {
			this.codeDepartement = codeDepartement;
		}

		public String getCodeVille() {
			return codeVille;
		}

		
		public void setCodeVille(String codeVille) {
			this.codeVille = codeVille;
		}

		
		public String getNom() {
			return nom;
		}

		
		public void setNom(String nom) {
			this.nom = nom;
		}

	
		public int getPopulation() {
			return population;
		}

	
		public void setPopulation(int population) {
			this.population = population;
		}
}
