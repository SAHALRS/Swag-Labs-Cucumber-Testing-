
public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  num= 7;
		int count =0;
		for(int i = 2;i<num;i++) {
			
			if(num % i == 0) {
				
				count++;
			}
			
			
		}
		if(count==0) {
			
			System.out.println(num+"is prime");
		}else {
			System.out.println(num+"is not prime");
		}
		}

	}


