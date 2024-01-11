package constructor;

public class ConstructorString{
	//Publicly declare
	String color;
	int quantity;
	float weight;
	char grade;
	
	
	 public ConstructorString()//constructor
   {
		 //initialize
	   color="Red";
	   quantity=20;
	   weight=500.80f;
	   grade='A';
	 	   
}
   public void fruits() //method
   {
	   System.out.println("Apple Color is= "+color);
	   System.out.println("Apple quantity is ="+quantity);
	   System.out.println("Apple weight is= "+weight);
	   System.out.println("Apple grades is= "+grade);
	   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	   
	
   }
   
   
   public void fruits1(String color, int quantity) 
   {
	   System.out.println("Mango Color is= "+color);
	   System.out.println("Mango quantity is= "+quantity);
	   System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	   
   }
	public static void main(String[] args) {
		ConstructorString cs= new ConstructorString();
		cs.fruits();
		ConstructorString cs1= new ConstructorString();
		cs1.fruits1("Orange_Yellow", 36);
		
		

	}
}


