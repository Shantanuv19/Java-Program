// nested if
import java.util.*;
class test{
	public static void main(String[] args)
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter 1st value:- ");
		a=obj.nextInt();
		if(a>=0 && a<=10)
		System.out.println("A is Between 0 - 10:- "+a);
		if(a>=11 && a<=20)
		System.out.println("A is Between 10 - 20:- "+a);
		if(a>20 && a<=30)
		System.out.println("A is betweeen 20 - 30:- "+a);
	}
}
