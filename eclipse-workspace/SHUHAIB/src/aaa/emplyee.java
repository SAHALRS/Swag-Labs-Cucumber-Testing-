package aaa;

public class emplyee {
	
	int empid;
	String name;
static	String designation="developer";
	int salary;
	
	public void display() {
		System.out.println("empid="+empid);
		System.out.println("name="+name);
		System.out.println("designation="+designation);
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
emplyee e=new emplyee();
e.empid=01;
e.name="shuhab";
//e.designation="devoleper";
e.salary=5000;
e.display();

emplyee e1=new emplyee();
e1.empid=01;
e1.name="shuhab";
designation="tester";
e1.salary=5000;
e1.display();

	}

}
