package OOPsInheritance;

public class BMW extends Car{ // has-a relationship (class to class)
	
	/* When same method is present in parent class and child class with same name and and same number 
	of argument is called method overriding */
	

	public void Start() {//Overridden Method
		System.out.println("Start -- BMW");
	}
	public void TheftSaftey() {
		System.out.println("Theft Safety -- BMW");
	}
	
}
