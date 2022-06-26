// Logical operator
import java.util.*;
class test{
	public void fun(int a, int b)
	{
		if(a>10 && a<20)
		System.out.println("value of a and b is between 10 and 20");
		if(a>=10 && a<=20 || a>=20 && a<=30)
		System.out.println("a is bettween 10 - 30");
		if(a!=b)
		System.out.println("A not equal to b");
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
