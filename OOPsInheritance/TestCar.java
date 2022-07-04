package OOPsInheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		//Static Polymorphism -- Compile Time Polymorphism
		BMW bmw = new BMW();
		
		bmw.Start();
		bmw.Stop();
		bmw.Refuel();
		bmw.TheftSaftey();
		bmw.Engine();
		
		System.out.println("---------------------------");
		
		Car c = new Car();
		c.Start();
		c.Refuel();
		c.Stop();
		System.out.println("---------------------------");
		
		/*Child class object can be referred by parent class reference variable -- Dynamic Polymorphism 
		--> Run Time Polymorphism */
		//Top casting
		Car c1 = new BMW();
		c1.Start();
		c1.Stop();
		c1.Refuel();
		
		//Down Casting
		BMW b1 = (BMW)new Car();// ClassCastException
		
		
	
	}

}
