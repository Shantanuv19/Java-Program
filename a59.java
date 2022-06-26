// multilevel class
class a{
	public void add()
	{
		System.out.println("Addition of two number:- " +(5+5));
	}
}
class b extends a{
	void sub()
	{
		System.out.println("Subtraction of two number is:- " +(5-5));
	}
}
class c extends b{
	void pro()
	{
		System.out.println("product of two number is:- " +(5*5));
	}
}
class test{
	public static void main(String args[])
	{
		c obj=new c();
		obj.pro();
		obj.sub();
		obj.add();
	}
}
