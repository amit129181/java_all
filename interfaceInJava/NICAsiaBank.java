package interfaceInJava;

public class NICAsiaBank extends Finance implements USBank, CanadaBank {//Achieving Multiple Inheritance  -- Is-a relationship (interface to class)
	
	
	/* If a class is implementing any interface then it's mandatory to define/override all the method 
	of interface */ 
	
	//All the methods of interface -- USBank -- Overriden Method
	public void Credit() {
		System.out.println("NICAsia -- Credit");
	}
	public void Debit() {
		System.out.println("NICAsia -- Debit");
	}
	
	public void TransferMoney() {
		System.out.println("NICAsia -- Transfer Money");
	}
	
	//CanadaBank -- Overriden Method
	public void MutualFund() {
		System.out.println("NICAsia -- Mutual Fund");
	}
	
	//Separate methods of NICAsiaBank
	public void HomeLoan() {
		System.out.println("NICAsia -- Home Loan");
	}
	public void AutoLoan() {
		System.out.println("NICAsia -- Auto Loan");
	}
}
