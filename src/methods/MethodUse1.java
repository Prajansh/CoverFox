package methods;

public class MethodUse1 {

	public static void main(String[] args) {
		MethodUse1 mu1= new MethodUse1();
		vehical();
		vehical1("KIA","Blue",40);
		mu1.vehical2();
		mu1.vehical3("Toyoto","Black", 0);
		//====================================================================
		//Calling another static and non static class
		MethodUse2.quotation();
		MethodUse2 mu2=new MethodUse2();
		mu2.quotation1("Aparna Mane", 1200000l);
		

	}
public static void vehical()
{
	String name="Renault";
	String color="Grey";
	int milage=20;
	
	System.out.println("========================================");
	System.out.println("Kiger car manufacturing by "+name);
	System.out.println("Color is "+ color);
	System.out.println("Car milage is "+milage);
	System.out.println("=======================================");
}

public static void vehical1(String name,String color,int milage)
{
	
	
	System.out.println("========================================");
	System.out.println("Seltos car manufacturing by "+name);
	System.out.println("Color is "+ color);
	System.out.println("Car milage is "+milage);
	System.out.println("=======================================");
}
public void vehical2()
{
	
	String name="Maruti Suzuki";
	String color="Red";
	int milage=30;
	
	System.out.println("========================================");
	System.out.println("Swift car manufacturing by "+name);
	System.out.println("Color is "+ color);
	System.out.println("Car milage is "+milage);
	System.out.println("=======================================");
	

	}
public void vehical3(String name,String color,int milage)
{
	
	
	System.out.println("========================================");
	System.out.println("Glanza car manufacturing by "+name);
	System.out.println("Color is "+ color);
	System.out.println("Car milage is "+milage);
	System.out.println("=======================================");
}






}
