/**Java Program For Matrix Multiplication**/
import java.util.*;
public class MatrixMultiplication {
	public static void main(String[] args)
	{

		int a[][],b[][],res[][];
		int row1,column1;
		int row2,column2;
		
		Scanner take=new Scanner(System.in);
		System.out.println("enter number of rows of a");
		row1=take.nextInt();	
		System.out.println("enter number of columns of a");
		column1=take.nextInt();
		System.out.println("enter number of rows of b");
		row2=take.nextInt();
		System.out.println("enter number of columns of b");
		column2=take.nextInt();
		
		
		System.out.println("enter array elements of a");
		a=new int[row1][column1];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column1;j++)
			{
				a[i][j]=take.nextInt();
			}
		}
		System.out.println("enter array elements of b");
		b=new int[column2][row2];
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<column2;j++)
			{
				b[i][j]=take.nextInt();
			}
		}
		res=new int[row2][column1];
		if(column1==row2) {
		for(int i=0;i<row1;i++)
		{
			for(int j=0;j<column2;j++)
			{
				res[i][j]=0;
				for(int k=0;k<column1;k++)
				{
					res[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Product Of Matrices Are:");
		
		for(int i=0;i<column1;i++)
		{
			for(int j=0;j<row2;j++)
			{
				System.out.print(res[i][j]);
				System.out.print("\t");
			}
			System.out.println("");
		}
		
	}
		else {
			System.out.println("not possible");
		}

}
}
