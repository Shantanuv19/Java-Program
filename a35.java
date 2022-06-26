// with return with parameter
import java.util.*;
class test{
	int add()
	{
		int a, b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st element:- ");
		a=s.nextInt();
		System.out.println("Enter 2nd element:- ");
		b=s.nextInt();
		return (a+b);
	}
	public static void main(String[] args)
	{
		int x;
		test obj=new test();
		x=obj.add();
		System.out.println("Addition of two number is:- "+x);
	}
}
