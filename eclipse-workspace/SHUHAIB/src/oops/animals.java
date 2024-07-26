package oops;


 class dog{
	 public void eating()
	 {
	System.out.println("dog is eating");
	 }
	 public void sleeping()
	 {
		 
	 }
	 
	 
}
	 
 
class B extends dog
{
	public void running()
	{
		System.out.println("running");
	}
	
}
 
	 
 


public class animals {

	public static void main(String[] args) {
		dog ob=new dog();
		ob.eating();
		ob.sleeping();
		B li=new B();
		li.eating();
		li.sleeping();
		li.running();
			
		
		
	}

}
