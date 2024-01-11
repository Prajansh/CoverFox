package controlStatements;

public class IfStatementsUse {

	public static void main(String[] args) {
		
		////If gender is M then I am male 
		
		char gender='M';
		if(gender=='M')
		{
			System.out.println("Gender is "+gender);
			System.out.println("========================");
		}
	
	//if my marks greater than or equal to 40--> then I am pass
	
	int marks=89;
	if(marks>=40)
	{
	System.out.println("I am pass");
	System.out.println("========================");
	}
	
	
	//if color is red then--> stop
	String color="red";
	if(color=="red")
	{
	System.out.println("Color is red ,please Stop");
	}
}
}
