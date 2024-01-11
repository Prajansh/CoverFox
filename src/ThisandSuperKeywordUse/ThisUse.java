package ThisandSuperKeywordUse;


public class ThisUse extends Practice {

	
		int a=200;	
		public void test()
		{


			
			int sum=super.a+a;
			System.out.println(sum);
		}
				
				
				public static void main(String[] args) {
					ThisUse  p =new ThisUse ();
					p.test();
					
					
				
				}	
			}
