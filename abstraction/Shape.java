package abstraction;

public abstract class Shape {

	Shape(){
		System.out.println("Shape -- Constructor");
	}

	String color;
	
	abstract void Drawing();
	
	public void Fill() {
		System.out.println("Shape -- Fill Color");
	}
	// Cannot create the object of abstract class
	// Abstraction -- Process of hiding the implementation details
}
