
public class Cercle implements objetGeometrique {

	private double rayon;

	public Cercle (double rayon ) {
		super();
		this.setRayon(rayon);
	}

	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*Math.PI*rayon;
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return rayon ;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
