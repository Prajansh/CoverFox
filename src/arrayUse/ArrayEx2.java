package arrayUse;

public class ArrayEx2 {

	public static void main(String[] args) {
		//marks-->int
		int[] marks=new int[5];
		marks[0]=9;
		marks[1]=8;
		marks[2]=10;
		marks[3]=7;
		marks[4]=6;
		//
		int[] grade= {8,9,7,10,6,4};
		System.out.println(grade.length);
		System.out.println("============================");
		//I want to store colours
		String[] colors= {"RED","BLACK","PINK","YELLOW"};
		for(int j=0;j<=3;j++) {
			System.out.println(colors[j]);
		}
		System.out.println("===============================");
		
		//I WANT TO STORE ALPBHABATES
		char[] alpha= {'A','B','C','Z'};
		//fix for loop
		for(int i=0;i<=3;i++)
		{
		System.out.println(alpha[i]);
		}
		System.out.println("========================");
		//varying / dynamic
		for(int i=0;i<=alpha.length-1;i++)
		{
		System.out.println("alpha of "+i+" "+alpha[i]);

		}
		System.out.println("=======================");
		for(int j=0;j<=colors.length-1;j++){
System.out.println("Colors of "+j+" "+colors[j]);			
		}
	}

}
