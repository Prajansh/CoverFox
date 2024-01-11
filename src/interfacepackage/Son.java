package interfacepackage;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		Son s =new Son();
		s.looks();
		s.behaviour();
		s.house();
		s.land();
		s.love();
		Mother.love();//static method

	}

	@Override
	public void looks() {
		System.out.println("Son looks like his mom");
		
	}

	@Override
	public void behaviour() {
		System.out.println("Son behaviour some things comes from mom");
		
	}

	@Override
	public void house() {
		System.out.println("Son has Father's house");
		
	}

	@Override
	public void land() {
		System.out.println("Son has Father's land");
		
	}

	@Override
	public void love() {
		Father.super.love();//default,from same method name
		//Mother.super.love();
		
	}

}
