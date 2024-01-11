package methods;

public class NonStaticFromSameClass {

	public static void main(String[] args) {
		NonStaticFromSameClass s= new NonStaticFromSameClass();
		s.nonstatic1();
		s.nonstatic2();

	}
 public void nonstatic1() {
	 System.out.println("This is nonstatic method 1");
 }
 
 public void nonstatic2() {
	 System.out.println("This is nonstatic method 2");
 }
}
