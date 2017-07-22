package beginner;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
	int i;
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int a[]=new int[n];
	for(i=0;i<n;i++)
	{
		a[i]=s.nextInt();
		
	}
	int l=n/2;
	int sum=0,sum1=0,c=0,c1=0;
	float avg=0,avg1=0;
	for(i=0;i<l&&a[i]>0;i++)
	{
		sum=sum+a[i];
		c++;
	}
	for(i=l;i<n&&a[i]>0;i++)
	{
		sum1=sum1+a[i];
		c1++;
	}
	avg=sum/c;
	avg1=sum1/c1;
	if(avg==avg1)
	{
		System.out.println("Average are same");
	}
	else
	{
		System.out.println("Average are not same");
		
	}
	}
	
	}
	


