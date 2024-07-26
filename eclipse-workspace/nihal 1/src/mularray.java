
public class mularray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marray[][] = new int[2][3];
		
		marray[0][0]=2;
		marray [0][1]=2;
		marray[0][2]=2;
		marray[1][0]=2;
		marray[1][1]=2;
		marray[1][2]=2;
		
		for(int r =0; r<2; r++) {
			for(int c=0; c<3;c++) {
				System.out.println(marray[r][c]+"");
			}
			System.out.println();
		}

	}

}
