package castingUse;

public class Upcasting {

	public static void main(String[] args) {
		
	System.out.println("===========Super_Class==========");
	GrandMother gm= new GrandMother();
	gm.behaviour();
	gm.look();
	System.out.println("===========Sub_Class============");
	Mother m= new Mother();
	m.behaviour();
	m.look();
	m.recipe();
	
	System.out.println("=========Upcasting=============");
	//creating object of subclass & giving reference of superclass
	GrandMother gm1= new Mother();
	gm1.behaviour();
	gm1.look();
	
	//gm1.recipe(); we cant access property of sub class
	}

}
