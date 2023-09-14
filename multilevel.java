package inherit;



public class multilevel {
	

		public static void main(String[] args) {
			c1 obj=new c1();
					obj.method1();
			obj.method2();
			obj.method3();
			
			// TODO Auto-generated method stub

		}

	}
	class A1{
		void method1() {
			System.out.println("from method 1");
			
		}
	}
	class B1 extends A1{
		void method2() {
		System.out.println("from mrthod 2");
	}

	}
	class c1 extends B1{
		void method3() {
			System.out.println("from method 3");
		}
	}