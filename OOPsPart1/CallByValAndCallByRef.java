package OOPsPart1;

public class CallByValAndCallByRef {
	
	int p,q;

	public static void main(String[] args) {
		
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		
		
		int x=10,y=30;//A copy of x & y is assigned to a & b
		int sum = obj.Sum(x, y);//Call By Value
		System.out.println("Call By Value --> Sum: "+sum);
		
		System.out.println("-------------------------------------------\n");
		obj.p = 60; //object reference
		obj.q = 70; //object reference
		System.out.println("Before Swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		System.out.println("-------------------------------------------\n");
		
		obj.swap(obj);
		//After swap
		System.out.println("After Swap");
		System.out.println("Call By Reference: --> Value of p: "+obj.p);
		System.out.println("Call By Reference: --> Value of q: "+obj.q);
		
	}

	
	public int Sum(int a, int b) {
//		a = 20; b = 30; // Changing the value of a & b
		int sum = a+b;
		return sum;
	}
	
	//Call By Reference
	public void swap(CallByValAndCallByRef t) { // Passing the value as object reference
		int temp;
		temp = t.p; // temp =60
		
		t.p = t.q;  // t.p = 70
		
		t.q = temp; // t.q = 60
	}
}
