//static variable
class test{
	static int a=10;
	static char c='S';
	public void fun()
	{
		int a=5;
		System.out.println("After change value:- "+a);
	}
	public static void main(String args[])
	{
		test obj=new test();
		System.out.println("Before value change:- "+a);
		System.out.println("value of int and char is:- "+c);
		obj.fun();
	}
}
