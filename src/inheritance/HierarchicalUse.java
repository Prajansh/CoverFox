package inheritance;

public class HierarchicalUse {

	public static void main(String[] args) {
		Father f = new Father();
		f.look();
		Father.behaviour();
		Son s= new Son();
		s.laptop();
		Son.bike();
		Son2 s2= new Son2();
		s2.mobile();

	}
	
	

}
