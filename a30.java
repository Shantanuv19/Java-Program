//scan arr value
import java.util.*;
class test{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:- ");
		int arr[]=new int[5];
		for(int a=1; a<=4; a++)
		{
			arr[a]=s.nextInt();
		}
		for(int a=1; a<=4; a++)
		{
			System.out.print(arr[a]+" ");
		}
	}
}
