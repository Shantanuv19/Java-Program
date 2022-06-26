//sum of arr value
import java.util.*;
class test{
	public static void main(String args[])
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:- ");
		int arr[]=new int[5];
		for(int a=1; a<=4; a++)
		{
			arr[a]=s.nextInt();
			sum+=arr[a];
		}
		System.out.print(sum);
	}
}
