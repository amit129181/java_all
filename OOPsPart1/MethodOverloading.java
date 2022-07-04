package OOPsPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		
		obj.Sum();
		obj.Sum(3);
		obj.Sum(23.383);
		obj.Sum(10, 20);

	}
	
	public static void main(String i) {
		
	}
	
	//We cannot create method inside method
	/*Duplicate methods -- same method name with same arguments are not allowed but with different data
	types are allowed */
	
	
	/*Method Overloading --> When the method is same with different parameters and different parameter's 
	data types within the same class */
	
	public void Sum() {//0 Param
		System.out.println("Sum Method - Zero Param");
	}
	
	public void Sum(int i) {//Method Overloading -- 1 Param
		System.out.println("Sum Method - 1 Param: "+i);	
	}
	
	public void Sum(double i) {//Method Overloading -- 1 Param
		System.out.println("Sum Method - 1 Param: "+i);	
	}
	
	public void Sum(int i, int j) {//Method Overloading -- 2 Param
		System.out.println("Sum Method - 2 Param: "+(i+j));
	}

}
