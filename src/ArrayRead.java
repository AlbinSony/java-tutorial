/**Java Program to Read A One Dimensional Array**/
import java.util.*;
public class ArrayRead {
	public static void main(String[] args)
	{
		Scanner take=new Scanner(System.in);
		int a[];
		System.out.println("enter size of array:");
		int size=take.nextInt();
		a=new int[size];
		System.out.println("enter elements");
		for(int i=0;i<size;i++) {
			a[i]=take.nextInt();
		}
		System.out.println("elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
