package constructor;

public class Demo {
	//public Demo()// user defined without parameter constructor
	{
	System.out.println("HI this is constructor");
	System.out.println("===========================");
	}
	
	public static void main(String[] args)
	{
	
       Demo d= new Demo();// created object of a class
       d.test();
	}
	public void test ()
	{
	System.out.println("HI GOOD EVENING");
	}
	}

