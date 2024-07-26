package nihal3;

public class details {
	String name;
	int age;
	double cgpa;
	static String course="testing";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object creation ->classname objectname=new class name();
		details st1 =new details();
		
		System.out.println("student 1 details");
		System.out.println("name  ="+(st1.name="swathy"));
		System.out.println("age  ="+(st1.age=32));
		System.out.println("cpga  ="+(st1.cgpa=6.7));
		System.out.println("course="+course);
		
		System.out.println("==============");

		details st2 =new details();
		
		System.out.println("student 2 details");
		System.out.println("name  ="+(st2.name    ="suhaib mohammed"));
		System.out.println("age  ="+(st2.age =32));
		System.out.println("cgpa  ="+(st2.cgpa=8.7));
		System.out.println(course="java");
		
	}

}
