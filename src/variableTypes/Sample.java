package variableTypes;

public class Sample {

		int g_value=30;// global variable
		public static void main(String[] args)
		{
		Sample s= new Sample();
		s.test1();
		s.test2();
		}
		public void test1()
		{
		int l1=50;// local variable variable declaration
		int addition=l1+g_value;
		System.out.println("Answer is "+addition);
		}
		public void test2()
		{
		
		int l2=90;
		int substraction=l2-g_value;
		System.out.println("Answer is "+substraction);
		

	}

}
