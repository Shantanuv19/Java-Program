// single inheritance
class a{
	void add()
	{
		int a=10, b=20;
		System.out.println("Addition of two number is:- " +(a+b));
	}
}
class b extends a{
	void sub()
	{
		int a=10, b=20;
		System.out.println("Subtraction of two number is:- " +(a-b));
	}
}
class test{
	public static void main(String args[])
	{
		b obj=new b();
		obj.add();
		obj.sub();
	}
}
