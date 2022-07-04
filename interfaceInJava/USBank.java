package interfaceInJava;

public interface USBank {
	
	int min_balance = 1000;//Variable value must be initialized in interface

	public void Credit();//Abstract Method -- Without method body
	
	public void Debit();
	
	public void TransferMoney();
	
	//Only method declaration
	//No method Body -- only method prototype
	//In interface we can declare the variable , Variable are by default static in nature
	//Variable value cannot be changed
	//No static method in interface
	//No main method in interface
	//We cannot create the object of interface 
	//Interface is abstract in nature
	/* 100% Abstraction */
}
