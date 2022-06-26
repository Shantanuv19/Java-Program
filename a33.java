// user input arr
import java.util.*;
class test{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter element of the arr:- ");
		for(int a=0; a<=2; a++)
		{
			for(int b=0; b<=2; b++)
			{
				arr[a][b]=obj.nextInt();
			}
		}
		for(int a=0; a<=2; a++)
		{
			for(int b=0; b<=2; b++)
			{
				System.out.print(arr[a][b]+" ");
			}
			System.out.println();
		}
	}
}
