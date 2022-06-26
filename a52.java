// constructor
class test{
	int a,b;
	// default constructor
	test()
	{
		a=5;
		b=5;
		System.out.println("Addition of two number is:- "  +(a+b));
	}
	public static void main(String args[])
	{
		System.out.println("!!Output through constructor!!");
		test obj=new test();
	}
}
