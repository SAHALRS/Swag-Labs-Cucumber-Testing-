package oops;

class dog{
	
public void eating() {
	System.out.println("dog is eating");
}
	public void sleeping()
	{
		System.out.println("dog is sleeping");
		
	}
	

}



class b extends dog
{
public void running()	
{
	System.out.println("running");
}
}

	


public class animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog ob = new dog();
ob.eating();
	}

}
