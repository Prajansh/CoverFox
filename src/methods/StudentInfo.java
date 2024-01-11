package methods;

public class StudentInfo {

	 public static void main(String[] args) {
		
		StudentInfo sd= new StudentInfo();
		sd.student_details();
		sd.student_details("Kusum", 11, 'F', 78.6f);
		sd.student_details("Akash", 45, 'M', 91.56f);
		
		
	}
	
	public void student_details()
	{
		String name;
		int roll_num;
		char gender;
		float percentage;
		String city;
		
		name= "Riya";
		roll_num= 7;
		gender='F';
		percentage=89.4f;
		city="Pune";
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("Student Name is "+name);
		System.out.println("Student Name is "+roll_num);
		System.out.println("Student Name is "+gender);
		System.out.println("Student Name is "+percentage);
		System.out.println("Student Name is "+city);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
	}
	
	public void student_details(String name,int roll_num,char gender,float percentage)
	{
		
		String city;
		city="Pune";
		System.out.println("Student Name is "+name);
		System.out.println("Student Name is "+roll_num);
		System.out.println("Student Name is "+gender);
		System.out.println("Student Name is "+percentage);
		System.out.println("Student Name is "+city);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		

	
}
}



