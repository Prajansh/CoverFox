package abstractClass;

public abstract class AbstractUse {

	public static void main(String[] args) {
		//AbstractUse au=new AbstractUse();//we can not create object abstract class
		//au.test();
				

	}
	
	public void test()
	{
		System.out.println("This is abstract class");
	}
	
	public abstract void sample();
	
	public static void test4()//static complete method
	{
	System.out.println("static complete method");
	}
	//public abstract static void test5();//we cannot make static method as abstract method
	}

