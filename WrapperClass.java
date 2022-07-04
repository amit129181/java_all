
public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		
		int y = 40;
		
		System.out.println(x+20);
		
		//Data Conversion --> String to int
		int i = Integer.parseInt(x);
		
		System.out.println(i+y);
		
		//Integer, Double, Boolean
		
		char st = 'A';
		String d = Character.toString(st);
		System.out.println(d);
		
		
		//int to String
		int z = 200;
		
		String s = String.valueOf(z);
		System.out.println(s+z);

		String c = "100A";
		
		Integer.parseInt(c);//NumberFormatException
		
	}

}
