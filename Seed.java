package beginner;

import java.util.Scanner;

public class Seed {
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=n;
		int sum=0;
		while(n!=0)
			
			{
			int r=n%10;
			n=n/10;
			sum=sum+(n1*r);
			
			
		}
		System.out.println(n1+"is a seed of"+sum);
	
		
		
	}

}
