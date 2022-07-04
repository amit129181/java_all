package OOPsPart1;

public class StaticAndNonStatic {
	
	String s = "Amit Yadav";//Non-Static Global Variable
	
	static int i = 10;//Static Global Variable

	public static void main(String[] args) {
		
		// Calling Static method and variable
		//1. Direct Calling 
		Sum();
		System.out.println(i);
		
		//2. By Classname
		StaticAndNonStatic.Sum();
		System.out.println(StaticAndNonStatic.i);
		
		//Calling Non-Static Method and Variable
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.SendMail();//Calling Non-Static Method
		System.out.println(obj.s);//Calling Non-Static Variable
		
		//Can we access Static Method and Variable using object reference? Yes
		obj.Sum(); // Warning will be given
		System.out.println(obj.i);// Warning will be given
	}
	
	public void SendMail() {//Non-Static Method
		System.out.println("Send Mail: Non Static Method");
		
	}
	
	public static void Sum() {//Static Method
		System.out.println("Sum Method: Static Method");
	}

}
