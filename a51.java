// object and class
import java.util.*;
class test{
	// data member
	int height, width;
	//member function
	void area()
	{
		System.out.println("Area of rectengle is:- " +(height*width));
	}
	public static void main(String args[])
	{
		test obj=new test();
		Scanner s=new Scanner(System.in);
		obj.height=s.nextInt();
		obj.width=s.nextInt();
		obj.area();
	}
}
