package Interface;

public class interfaceProgram {

	public static void main(String[] args) {
	
		
		interface A
		{
		    void test();
		}

		interface B 
		{
		    void test();
		}

		class C implements A, B
		{

		    public void test() 
		    {
		        System.out.println("abc");
		    }
		}

		   A a = new C();
		   a.test();
		   B b = new C();
		   b.test();

}

}




