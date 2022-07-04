package javaInterface;

public class TestBank {

	public static void main(String[] args) {
		
		NICAsiaBank nic = new NICAsiaBank();
		
		nic.CarLoan();
		nic.Credit();
		nic.Debit();
		
		System.out.println("Minimum Balance in Account: "+RBB.min_balance);
		
		USBank us = new NICAsiaBank();
		us.Credit();
		us.Debit();
		us.Trading();
		us.TranferMoney();
		
	}

}
