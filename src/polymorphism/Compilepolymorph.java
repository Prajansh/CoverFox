package polymorphism;

public class Compilepolymorph {

	public static void main(String[] args) {
		Compilepolymorph cp = new Compilepolymorph();
		cp.students();
		cp.students("Ajinkya", 12);
		cp.students(89.54f, 'A');
		cp.students("Rajgad");
		}
public void students()
{ 
	System.out.println("Students Data");
	System.out.println("------------------------------------");
}
public void students(String name,int roll_no)
{ 
	System.out.println("Name and Roll No is "+name + " "+roll_no);
	System.out.println("------------------------------------");
}
public void students(float marks ,char grade)
{ 
	System.out.println("Marks and Grade is "+marks +   " " +grade);
	System.out.println("------------------------------------");
}
public void students(String hostel_name)
{ 
	System.out.println("Hostel Name is "+hostel_name);
	System.out.println("------------------------------------");

}


}
