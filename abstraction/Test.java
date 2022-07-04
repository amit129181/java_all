package abstraction;

public class Test extends Shape{
	
	Test(){
		System.out.println("Test -- Constructor");
	}

	public static void main(String[] args) {
		
//		Shape s  = new Test();
//		
//		s.Drawing();
//		
//		s.Fill();
		
		Test test = new Test();
		
		test.color = "Blue";
		
		System.out.println(test.color);

	}

	@Override
	void Drawing() {
		System.out.println("Test -- Darwing");
		
	}

}
