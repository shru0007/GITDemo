package InterfaceConcepts;

public class developing implements BankingClient {
	
	public static void main(String[] args) {
		developing dr = new developing();
		dr.payCreditcardBill();
	}

	@Override
	public void payCreditcardBill() {
		// TODO Auto-generated method stub
		System.out.println("PAy credit card Billl");
		
	}

	@Override
	public void transferBalance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkingBalance() {
		// TODO Auto-generated method stub
		
	}

}
