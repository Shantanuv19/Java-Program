// parameterized constructor
import java.util.*;
class test{
	// copy constructor
	int c;
	test(int a, int b)
	{
		c=a+b;
	}
	void show()
	{
		System.out.println("Addition of two number is:- " +c);
	}
	public static void main(String args[])
	{
		Scanner s=new  Scanner(System.in);
		System.out.println("!!Output through constructor!!");
		int a,b;
		System.out.println("Enter 1st number");
		a=s.nextInt();
		System.out.println("Enter 2nd number");
		b=s.nextInt();
		test obj=new test(a, b);
		test obj2=obj;
		obj2.show();
	}
}
