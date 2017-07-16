package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Hunter {
	public static void main(String[]args)
	{
		
		Scanner s=new Scanner(System.in);
		int sc=s.nextInt();
		int c=0;
		int a[]=new int[sc];
		for(int i=0;i<sc;i++)
		{
			a[i]=s.nextInt();
			
		}
		Arrays.sort(a);
		for(int i=0;i<sc;i++)
		{
			if(a[i]==a[i+1])
			{
				c++;
			}
		}
	
				System.out.println(+c);
			
}
}
	


