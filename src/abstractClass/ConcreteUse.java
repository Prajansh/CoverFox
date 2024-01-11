package abstractClass;

public class ConcreteUse extends AbstractUse{

	public static void main(String[] args) {
		ConcreteUse cu = new ConcreteUse();
		cu.sample();
		cu.test();
		AbstractUse.test4();
	}

	@Override
	public void sample() {
	System.out.println("Abstract Incomplete method,Completed");
		
	}

}
