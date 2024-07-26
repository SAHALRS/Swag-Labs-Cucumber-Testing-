
public class exaption {

	public static void main(String[] args) {
		
	int a = 10,b=0;
	try {
	 int c=a/b;
	 System.out.println(c);
	}
	catch(Exception s)
	{
		System.out.println("Arithamatic exception");
	}
	
	
	try {
	
	String name=null;
	System.out.println(name.length());
	}
	catch(Exception d)
	{
		System.out.println("perfectly alright");
	}
	

	}

}
