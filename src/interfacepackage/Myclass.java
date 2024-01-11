package interfacepackage;

public class Myclass implements MyInterface {

	public static void main(String[] args) {
		Myclass m=new Myclass();
		m.test();
		m.test1(12, 50);
        m.own();
	}

	@Override
	public void test() {
		System.out.println("This is Public Incomplete now completed Method");
		
	}

	@Override
	public void test1(int i,int j) {
		int sum=i+j;
		System.out.println("addition is "+sum);
		
	}
	
	public void own() {
		System.out.println("This is own Class Method");
	}
}
