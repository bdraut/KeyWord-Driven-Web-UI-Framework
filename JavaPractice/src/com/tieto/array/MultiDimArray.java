package com.tieto.array;

public class MultiDimArray {

	public static void main(String[] args) {
		int ma[][] = new int[2][3];
		 ma[0][0] = 2;
		 ma[0][1]=3;
		 ma[0][2]=7;
		 ma[1][0] = 6;
		 ma[1][1]=3;
		 ma[1][2]=9;

		 for (int i=0; i<2;i++)
		 {
			 for (int j=0;j<3;j++)
			 {
				 System.out.println(ma[i][j]);
			 }
		 }
	}

}
