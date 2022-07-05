package week3Day1;


public class AxisBank extends BankInfo {

	// Creating Methods block for AxisBank class

	@Override
	public void deposit() {
		int depositAmt = 20000;
		
		System.out.println("This is AxisBank Class' Method \n");
		System.out.println("AxisBank class Method is called : Rs." + depositAmt + "\n");

	}

	public static void main(String[] args) {

		// BankInfo class method deposit() execution

		AxisBank bankDeposit = new AxisBank();
		bankDeposit.deposit();
		bankDeposit.saving();
		bankDeposit.fixed();
		System.out.println("----------------------------\n");
		
				
		// BankInfo bankDeposit1 = new AxisBank();
		// bankDeposit1.deposit();
	}

}
