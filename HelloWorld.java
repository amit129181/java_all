
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");

		Object obj[] = { "Amit Yadav", 25, 'M' };

		for (int j = 0; j < obj.length; j++) {

			if (j == 0) {
				System.out.println("Name: " + obj[j]);
			} else if (j == 1) {
				System.out.println("Age: " + obj[j]);
			} else {
				System.out.println("Gender: " + obj[j]);
			}
		}

		int i[] = { 12, 13, 14 };

	}

}
