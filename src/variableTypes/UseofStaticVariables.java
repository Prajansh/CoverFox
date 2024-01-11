package variableTypes;

public class UseofStaticVariables {
	
	
	int a=100;
	static int b=50;

	public static void main(String[] args) {
		
		UseofStaticVariables su= new UseofStaticVariables();// created object of a class
		System.out.println("A vlaue is "+su.a);// calling non static global variable from same
		System.out.println("B value is "+b);
		
		//calling variable from another class
		
		AnotherClass ac= new AnotherClass();
		
		System.out.println("x value is "+ac.x);
		System.out.println("y value is "+AnotherClass.y);
		
		
		
	}
		
}
		