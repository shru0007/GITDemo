package Arrays;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class multidimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 0; 

		a[1][0] = 3;
		a[1][1] = 2;
		a[1][2] = 7;

		a[2][0] = 1;
		a[2][1] = 10;
		a[2][2] = 28;
		int minNum = 0;
		int mincolumn = 0;


		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] <= minNum) {
					minNum = a[i][j];
					System.out.println("min no. is present in " + j);
					mincolumn = j;
				}
			}
		}
		int MaxinminCol = a[0][mincolumn];
		int k=0;
		while(k<3){
			if(a[k][mincolumn]>MaxinminCol){
				MaxinminCol =a[k][mincolumn];
			}
			k++;
		}
		
		System.out.println("Minimum value is :  " + minNum);
		System.out.println("MaxinminCol value is :  " + MaxinminCol);
	}

}
