//Increment and  Decrement
import java.util.*;
class test{
	public static void main(String[] args)
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st value:- ");
		a=s.nextInt();
		
		System.out.println("Pre Increment:- "+(++a)+  "  Pre decrement:- "+(--a));
		System.out.println("Post Increment:- "+(a++)+ "  Post Decrement:- "+(a++));
	}
}
