package javaInterface;

public class NICAsiaBank implements RBB, USBank {

	//USBank interface method
	@Override
	public void Debit() {
		System.out.println("NICAsiaBank -- Debit");
		 
	}

	@Override
	public void Credit() {
		System.out.println("NICAsiaBank -- Credit");
		
	}

	@Override
	public void TranferMoney() {
		System.out.println("NICAsiaBank -- Transfer Money");
		
	}
	
	@Override
	public void Trading() {
		System.out.println("NICAsiaBank -- Trading");
		
	}

	//RBB interface method
	@Override
	public void EducationLoan() {
		System.out.println("NICAsiaBank -- Education Loan");
		
	}

	@Override
	public void HomeLoan() {
		System.out.println("NICAsiaBank -- Home Loan");
		
	}

	@Override
	public void CarLoan() {
		System.out.println("NICAsiaBank -- Car Loan");
		
	}
	
	//NICAsiaBank Methods
	public void MutualFund() {
		System.out.println("NICAsiaBank -- Mutual Fund");
	}
	
	public void Insurance() {
		System.out.println("NICAsiaBank -- Insurance");
	}

	
}
