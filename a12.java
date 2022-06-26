//  Bitwise operator
import java.util.*;
class test{
	public void fun(int a, int b)
	{
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a<<2);
		System.out.println(a>>2);
		System.out.println(a^b);
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
