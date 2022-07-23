
public class TestOperation {
	public static void main(String[] args) {

		Credit c1 = new Credit("2000", 10);
		Credit c2 = new Credit("2001", 11);
		Debit d1 = new Debit("2002", 12);
		Debit d2 = new Debit("2003", 13);
		Operation[] ops = { c1, c2, d1, d2};
		
		for(int i = 0; i < ops.length; i++ ) { 
			System.out.println(ops[i]);
		}
	}
	
}
