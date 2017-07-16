package beginner;

import java.util.Scanner;

public class Ass1 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String r=s.nextLine();
		if(r.equalsIgnoreCase("Monday")||r.equalsIgnoreCase("Tuesday")||r.equalsIgnoreCase("Wednesday")||r.equalsIgnoreCase("Thursday")||r.equalsIgnoreCase("Friday")||r.equalsIgnoreCase("Saturday"))
		{
		 System.out.println("true");
		}
		else if(r.equalsIgnoreCase("Sunday"))
		{
			System.out.println("false");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}

