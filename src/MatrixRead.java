/**Java Program to Read And Display Matrix**/
import java.util.*;
public class MatrixRead {
	public static void main(String[] args)
	{
		int a[][];
		int i,j,row,column;
		
		Scanner take=new Scanner(System.in);
		System.out.println("enter number of rows");
		row=take.nextInt();
		System.out.println("enter number of columns");
		column=take.nextInt();
		System.out.println("enter matrix elements");
		a=new int[row][column];
		
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=take.nextInt();
			}
		}
		System.out.println("entered matrix is");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("");
			
		}
	}

}
