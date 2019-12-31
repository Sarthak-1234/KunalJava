package abstractions;

public class USer {
	
	public static void main(String args[]) {
		//We cannot create the object of abstract class
		
		//but ----create and we have to implement the methods
		
		GramPanchayat obj = new GramPanchayat();
		obj.RBIdefaultfees();
		obj.setInterestRate();
		obj.setMinAccounts();
	}

}
