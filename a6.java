// Enter name, roll, marks
import java.util.*;
class test{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		String name;
		int roll;
		int marks;
		System.out.println("Enter your name:- ");
		name = obj.nextLine();
		System.out.println("Enter your roll:- ");
		roll = obj.nextInt();
		System.out.println("Enter your marks:- ");
		marks = obj.nextInt();
		System.out.println("Name:- "+name);
		System.out.println("roll:- "+roll);
		System.out.println("marks:- "+marks);
	}
}
