package controlStatements;

public class NestedIfUse {

	public static void main(String[] args) {
		{
			

int year=4355;

if(year%4==0)

{

System.out.println("This is leap year");

if(year%100==0)

{

System.out.println("This is centuary Year");

}
else

{

System.out.println("This is not centuary Year");

}





}

else

{

System.out.println("This is Not Leap year");

}

}
	}
}

