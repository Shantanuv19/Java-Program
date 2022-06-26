// multiple inheritance
interface a{
	void add();
}
interface b{
	void add();
}
class test implements a, b
{
	public void add()
	{
		int a=5, b=5;
		System.out.println("Subtraction of two number is:- " +(a+b));
	}
	public static void main(String args[])
	{
		test obj=new test();
		obj.add();
	}
}
