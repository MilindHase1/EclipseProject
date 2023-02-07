package PracticeSetPackage;

public class SuperKey extends  ThisKey{

	
  public static void main(String[] args) {
		
		ThisKey th=new ThisKey();
		th.display();
		SuperKey  su=new SuperKey();
		su.addition();
		
	}
  
  public void addition()
  {
	  int b=40;
	  int add=b+super.b;
	  
	  System.out.println("Addition of two number using by super keyworlds   "+add);
  }
}
