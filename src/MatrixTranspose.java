/**Java Program For Finding Transpose of A Matrix**/
import java.util.*;
public class MatrixTranspose {
	public static void main(String[] args)
	{

		int a[][],trans[][];
		int i,j,row,column;
		
		Scanner take=new Scanner(System.in);
		System.out.println("enter number of rows");
		row=take.nextInt();
		System.out.println("enter number of columns");
		column=take.nextInt();
		System.out.println("enter array elements");
		a=new int[row][column];
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=take.nextInt();
			}
		}
		trans=new int[row][column];
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				trans[i][j]=a[j][i];
			}
		}
		System.out.println("Transpose of Matrix is:");
		for(i=0;i<row;i++) {
			for(j=0;j<column;j++) {
				System.out.print(trans[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}

}
