//Instance variable
class test{
	int a=10;
	char c='S';
	public void fun()
	{
		System.out.println(a);
		System.out.println(c);
	}
	public static void main(String args[])
	{
		test obj=new test();
		System.out.println("value of int and char is:- ");
		obj.fun();
	}
}
