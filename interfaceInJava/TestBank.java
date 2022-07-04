package interfaceInJava;

public class TestBank {

	public static void main(String[] args) {
		
		NICAsiaBank b = new NICAsiaBank();
		System.out.println("Minimun Balance: "+USBank.min_balance);
		
		System.out.println("---------------------------");
		b.Credit();
		b.Debit();
		b.TransferMoney();
		b.AutoLoan();
		b.HomeLoan();
		
		System.out.println("----------------------------");
		b.Stock();
		
		
		System.out.println("---------------------------");
		
		//Dynamic Polymorphism
		//Child class object can be referred by parent interface reference variable
		USBank us = new NICAsiaBank();
		us.Credit();
		us.Debit();
		us.TransferMoney();
	
	}

}
