
public abstract class Operation {

	protected String date;
	protected int montant;

	public Operation(String date, int montant) {
		super();
		this.date = date;
		this.montant = montant;

	}

	public abstract String getType();

	public String toString() {
		return "-->" + date + " " + montant + " " + getType();
	}
}