// public, private, protected access
class a{
	public void b(){
	System.out.println("B");
	}
	public void c(){
	System.out.println("C");
	}
	//private void f()
	public void f()
	{
		System.out.println("private method data:- f");
	}
}
class e{
	protected void d()
	{
		System.out.println("Protected class data:- D");
	}
}
class test extends e{
	public static void main(String[] args)
	{
		System.out.println("!data of class a!");
		a obj=new a();
		obj.b();
		obj.c();
		obj.f();
		e obj2=new e();
		obj2.d();
	}
}
