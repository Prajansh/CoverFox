package inheritance;



public class MultiLevelInheritance {
	public static void main(String[] args) {
		Grandfather g =new Grandfather();
		g.receipe();
		Grandfather.keys();
		Father m=new Father();
		m.look();
		m.receipe();
		Grandfather.keys();
		Father.behaviour();
		Daughter d = new Daughter();
		d.laptop();
		Daughter.bike();
		
		
	
	
	}
	
	
	}

