// inheritence
class add{
	void add()
	{
		int  a=10, b=5;
		System.out.println("Addition of two number is:- " +(a+b));
	}
}
class sub extends add{
	void sub(){
	int a=10, b=5;
	System.out.println("Subtraction of two number is:- " +(a-b));
	}
}
class test{
	public static void main(String[] args)
	{
		sub obj=new sub();
		System.out.println("Value of sub is:- ");
		obj.sub();
		System.out.println("Value of add is:- ");
		obj.add();
	}
}
