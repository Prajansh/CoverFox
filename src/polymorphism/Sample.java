package polymorphism;

public class Sample extends RunTimePoly  {

	public static void main(String[] args) {

		Sample s = new Sample();
		s.demo1();
		RunTimePoly rt = new RunTimePoly ();
		rt.demo1();
		

	}
public void demo1()
{
	System.out.println("This is method from sub class");
}
}
