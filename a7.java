// Arithmetic operator
import java.util.*;
class test{
	public void fun(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition is:- "+c);
		System.out.println("Sub is:- "+(a-b));
		System.out.println("Product is:- "+(a*b));
		System.out.println("Div is:- "+(a/b));
	}
	public static void main(String[] args)
	{
		int a,b;
		test obj=new test();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st value:- ");
		a=s.nextInt();
		System.out.println("Enter 2nd value:- ");
		b=s.nextInt();
		obj.fun(a,b);
	}
}
