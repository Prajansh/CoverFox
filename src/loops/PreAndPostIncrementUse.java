package loops;

public class PreAndPostIncrementUse {

	public static void main(String[] args) {
		int i=10;
		int j;
		System.out.println(i);
		j=i++;
		// Post Increment
		System.out.println(j);
		System.out.println(i);
		System.out.println(j);
		//Pre Increment
		int a=20;
		++a;
		System.out.println(a);
		
		int x=15;
		System.out.println(x);
		--x;
		System.out.println(x);

	}

}
