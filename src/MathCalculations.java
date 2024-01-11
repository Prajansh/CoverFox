
public class MathCalculations {

	public static void main(String[] args) {
		

		MathCalculations cal= new MathCalculations();
	    cal.addition();
		
		cal.addition(50,45);
		cal.subtraction(10, 5, 6);
		cal.multiplication(11, 9);
		
		}
		public void addition()
		{
		      int a=10;
		      int b=20;
		      int sum;
              sum=a+b;
              System.out.println("==========================================");
		     System.out.println("addition is "+sum);
	    }
		public void addition(int a, int b)
		{
		            int sum=a+b;
		            System.out.println("==========================================");
		         System.out.println("Addition is "+sum);
		}
		public void subtraction(int a, int b,int c)
		{
		           int sub;
		           sub=a-b+c;
		           System.out.println("==========================================");
		           System.out.println("subtraction is "+sub);
		           
		}
		public void multiplication(int a, int b)
		{
		           int multi;
		           multi=a*b;
		           System.out.println("==========================================");
		           System.out.println("Multiplication is "+multi);
		}

}
