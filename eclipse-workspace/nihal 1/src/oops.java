
public class oops {
	
	String name;
	int age;
	String dob ="10/3/1990";
	
	public oops(String name,int age) {

		this.name=name;
		this.age=age;
	}
	void show() {
		
		System.out.println("my name is  "+  name);
		System.out.println("i am  "  +  age +"years old");
		System.out.println("DOB is"+(dob="20/12/2000"));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		oops obj = new oops("hari",20);
		obj.show();

	}

}
