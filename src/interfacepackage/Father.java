package interfacepackage;

public interface Father {
	void house();
	void land();
	default void love() {
		//System.out.println("Father loves Son");
	}

}
