package accessSpecifierUse;

public class Accsess {
	int a=20;
	private int b=50;
	public int c=60;
	protected static int d=80;

	public static void main(String[] args) {
   Accsess ac= new Accsess();
   ac.demo1();
ac.demo2();
ac.demo3();
ac.demo4();

		System.out.println("Value of a is " +ac.a);
		System.out.println("Value of a is " +ac.b);
		System.out.println("Value of a is " +ac.c);
		System.out.println("Value of a is " +d);
	}

	public void demo1() {
		int a =10;
		int b=50;
		int sum=a+b;
		System.out.println("Sum is "+sum);
		
		
	}
	 private void demo2() {
		 int a =80;
			int b=50;
			int sub=a-b;
			System.out.println("Sub is "+sub);
		 System.out.println("This is private method access only within class"+sub);
	 }
	
	protected void demo3()
	{
		int a=10;
		int b=6;
		int mul= a*b;
		System.out.println("This is access within package & outside of package by using Inheritance"+mul);
	}
	
	void demo4() {
		int a=200;
		int b=2;
		int div= a/b;
		System.out.println("This is access within package"+div);
		
	}
	
	
}
