// login program with equalTo
import java.util.*;
class test{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String s="a@gmail.com",p="123";
		String s1,p1;
		System.out.println("Enter gmail:- ");
		s1=obj.nextLine();
		System.out.println("Enter password:- ");
		p1=obj.nextLine();
		if(s.equals(s1)&& p.equals(p1))
		{
			System.out.println("Login....");
		}else{
		System.out.println("Envalid..");
		}
	}
}
