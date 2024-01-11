package variableTypes;

public class StaticUse {

	
		int a=90;
		static int b=99;
		
		public static void addition()
		{
		int sum;
	//int a=x;
		int c=50;
		sum=c+b;
				System.out.println("addition is"+sum);
		
		}
		public static void main(String[] args)
		{
		
			StaticUse s1 =new StaticUse();

            System.out.println(s1.a);
		}
	}


