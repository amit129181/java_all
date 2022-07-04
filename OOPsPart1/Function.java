package OOPsPart1;

public class Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("First called main method");
		
		Function obj = new Function();
		//one object will be created where obj is reference variable referring to this object
		//After creating the object , the copy of all non-static method will be given to this object

		obj.test();
		
		int s = obj.Sum();
		System.out.println(s);
		
		String c = obj.Concat();
		System.out.println(c);
		
		int m = obj.Multiply(10, 20);
		System.out.println(m);
	}
	
	//Non-Static Method
	
	//void doesn't have any return type
	public void test() { // no input , no output
		System.out.println("This is a test");
	}
	
	//return type -- int
	public int Sum(){ //no input , some output
		
		int a=10,b=30;
		
		int sum = a+b;
		
		return sum;
	}
	
	//return type -- String
	public String Concat() { //no input , some output
		
		String a="Hello", b="World";
		
		String concat = a +" "+b;
		
		return concat;
	}
	
	public int Multiply(int a, int b) {
		
		int multiply = a*b;
		
		return multiply;
	}
	
	

}
