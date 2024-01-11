package interfacepackage;

public class Multilevel implements MyInterface2 {

	public static void main(String[] args) {
		Multilevel ml=new Multilevel();
		ml.test();
		ml.test1(10, 20);
		ml.demo1();
		ml.demo2();

	}

	@Override
	public void test() {
		System.out.println("This is Public Incomplete now completed Method");
		
	}

	@Override
	public void test1(int i, int j) {
		int sum=i+j;
		System.out.println("addition is "+sum);
		
		
	}

	@Override
	public void demo1() {
		System.out.println("1st This is Interface 2 method incomplete");
		
	}

	@Override
	public void demo2() {
		System.out.println("2nd This is Interface 2 method incomplete");
		
	}

}
