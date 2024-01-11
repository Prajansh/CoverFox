
package polymorphism;

public class CompileTimePolymorph {

	public static void main(String[] args) {
		CompileTimePolymorph cp= new CompileTimePolymorph();
		cp.add();
		cp.add(10, 100);
		cp.add(12.2F, 88);
		}
		public void add()
		{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition is "+sum);
		System.out.println("========================================");
		}
		public void add(int a, int b)
		{
		int sum=a+b;
		System.out.println("Addition is "+sum);
		System.out.println("========================================");
		}
		public void add(float a, int b)
		{
		float sum=a+b;
		System.out.println("Addition is "+sum);
		System.out.println("========================================");
		}

		public void add(int a, float b)
		{
		float sum=a+b;
		System.out.println("Addition is "+sum);
		System.out.println("========================================");
		}
	
}
