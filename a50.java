// class into class
import java.util.*;
class a{
	public void add()
	{
		Scanner obj1=new Scanner(System.in);
		int a,b;
		a=obj1.nextInt();
		b=obj1.nextInt();
		System.out.println("Sum of two number is:- " +(a+b));
	}
	class b{
		public void nadd()
		{
		Scanner obj=new Scanner(System.in);
		int c,d;
		c=obj.nextInt();
		d=obj.nextInt();
		System.out.println("Sum of tow number is:- " +(c+d));
		}
	}
}
class test{
	public static void main(String args[])
	{
		System.out.println("class into class:- ");
		a o=new a();
		o.add();
		a.b ob=o.new b();
		ob.nadd();
	}
}
