//Relational operator
import java.util.*;
class test{
	public void fun(int a, int b)
	{
		int c=a+b;
		if(a==b)
		System.out.println("A and B are equal");
		if(a!=b)
		System.out.println("A and b are not equal");
		if(a>b)
		System.out.println("a geater then b");
		if(a<b)
		System.out.println("A less then b");
		if(a>=b)
		System.out.println("A greater then equal to b");
		if(a<=b)
		System.out.println("A Less then equal to b");
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
//Relational operator
import java.util.*;
class test{
	public void fun(int a, int b)
	{
		int x=b;
		System.out.println("="+(x));
		System.out.println("+="+(a+=b));
		System.out.println("-="+(a-=b));
		System.out.println("*="+(a*=b));
		System.out.println("/="+(a/=b));
		System.out.println("%="+(a%=b));
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
