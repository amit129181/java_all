package OOPsPart1;

public class LocalVsGlobalVariable {
	
	//Global Variable -- non static variable
	String name = "Amit Yadav";
	int age = 23;
	
	//Static variable
	static int age2 = 29;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 20;//Local Variable for main method
		System.out.println(i);
		
		//To access global variable , we need to create an object
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		
		System.out.println("Name: "+obj.name +"  Age: "+obj.age);
		System.out.println(age2);
		
	}
	
	public void Sum() {
		//Local variable for Sum method
		int a = 40;
		int i = 30;
		int age = 23;
	}

}
