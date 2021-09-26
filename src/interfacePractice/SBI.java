package interfacePractice;

public class SBI implements RBIInterface {
	
	int a = 10;
	int b = 5;

	public static void main(String[] args) {
		SBI obj1 = new SBI();
		obj1.homeLoan();
	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub
//		int a = 5;
		System.out.println(RBIInterface.b);
		SBI obj = new SBI();
		obj.b =12;
		System.out.println(obj.b);
		
	}

	@Override
	public void educationLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int loanPercentage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void marriageLoan() {
		
	}

}
