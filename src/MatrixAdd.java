/**Java Program For Matrix Addition**/
import java.util.*;
public class MatrixAdd {
	public static void main(String[] args)
	{
		
		int a[][],b[][],res[][];
		int i,j,row,column;
		
		Scanner take=new Scanner(System.in);
		System.out.println("enter number of rows");
		row=take.nextInt();
		System.out.println("enter number of columns");
		column=take.nextInt();
		System.out.println("enter array elements of a");
		a=new int[row][column];
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=take.nextInt();
			}
		}
		System.out.println("enter array elements of b");
		b=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=take.nextInt();
			}
		}
		
		res=new int[row][column];
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				res[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("Sum of matrix is :");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(res[i][j]);
				System.out.print("\t");
			}
			
			
		}
	}

}
