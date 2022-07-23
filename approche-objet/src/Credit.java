
public class Credit extends Operation {
	
	public Credit (String date, int montant) {
		super(date, montant);
		//this.date = date;
		//this.montant = montant;
		
	}
	
	//public String toString() {
		//return "-->" + date + " " + montant; 
		
		
	
	
	public String getType() {
		return "CREDIT";
	}
}
