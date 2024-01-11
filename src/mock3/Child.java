package mock3;

public class Child implements Father,Mother {

	public static void main(String[] args) {
		Child c = new Child();
		c.behaviour();
		c.looks();
	}

	@Override
	public void behaviour() {
		System.out.println("Child behave like Mother");
		
	}

	@Override
	public void looks() {
		System.out.println("Child look like Father");
		
	}

}
