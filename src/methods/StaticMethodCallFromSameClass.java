package methods;

public class StaticMethodCallFromSameClass {

	
	public static void call1()
	{
		System.out.println("This is Static Regular Method 1");
	}

     
	public static void call2()
	
	{
		System.out.println("This is Static Regular Method 2");
		System.out.println("===================================================");
	}
	
	public static void main(String[] args) {
		// Method Call
		
		call1();
		call2();
		
		StaticMethodFromAnotherClass.run1();
		StaticMethodFromAnotherClass.run2();
		
	}
	

}
