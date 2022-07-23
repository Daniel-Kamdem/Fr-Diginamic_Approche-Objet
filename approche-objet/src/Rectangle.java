
public class Rectangle implements objetGeometrique{

	private String longeur;
	private String largeur;
	
	@Override
	public double perimetre() {
		
		return 0;
	}
	@Override
	public double surface() {
		
		return 0 ;
	}
	public String getLongeur() {
		return longeur;
	}
	
	public void setLongeur(String longeur) {
		this.longeur = longeur;
	}
	
	public String getLargeur() {
		return largeur;
	}
	
	public void setLargeur(String largeur) {
		this.largeur = largeur;
	}
	
	
}
