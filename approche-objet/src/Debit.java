
public class Debit extends Operation{

	public Debit(String date, int montant) {
		super(date, montant);
		
		
	}
	
	//public String toString() {
		//return "-->" + date + " " + montant; 

// }
	
	public String getType() {
		return "DEBIT";
		
	}
	
	
}
