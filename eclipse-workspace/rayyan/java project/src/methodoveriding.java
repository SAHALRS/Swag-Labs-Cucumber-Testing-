

class parent
{
	String name="abc";
	public void phone()
	{
		System.out.println("nokia");
	}	
	public void car()
	{
		System.out.println("bmw");
	}
			
		
		
		
	
}
class child extends parent
{
	public void phone()
	{
		System.out.println("iphone");
		System.out.println(super.name);
	}
}


public class methodoveriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child c=new child();
c.car();

parent p =new parent();
p.phone();


		
		
		
	}

}
