package constructor;
public class ConstructorUse {

int a;// variable declaration
int b;
int c;
//use of constructor -->To initialize data member/variable
public ConstructorUse()// user defined zero/without parameter constructor
{
a=10;
b=20;
c=30;
}
public static void main(String[] args)
{
// The constructor is called when an object of a class is created.
ConstructorUse cu= new ConstructorUse();// created object of a class
cu.addition();
ConstructorUse add2 = new ConstructorUse();
add2.addition(20, 40);
ConstructorUse sub =new ConstructorUse();
sub.substraction(100, 90,10);

}
public void addition()
{
int sum;
sum=a+b+c;
System.out.println("Sum is "+sum);
System.out.println("===============================");

}

public void addition(int x,int y)
{

	a=x;
	b=y;
	int add=a+b;
	System.out.println("addition with parameter is "+add);
	System.out.println("===============================");
	
}
public void substraction(int x,int y,int z)

{
	a=x;
	b=y;
	c=z;
	int sub=a-b-c;
	
	
	System.out.println("Substraction is "+sub);
}




}
		

	
	