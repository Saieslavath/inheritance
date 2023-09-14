package inherit;


	class shape{
		public void display() {
			System.out.println("inside display");
		}
	}
		class regtangle extends shape{
			public void area() {
				System.out.println("inside area");
			}
			}
		
	
		public class singleLevel {
	public static void main(String[] args) {
		 regtangle rect = new  regtangle();
		rect.display();
		rect.area();
	}
		}
	
		
		
	
		// TODO Auto-generated method stub

	


