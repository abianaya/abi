package SkillRack;

import java.util.Scanner;

public class Count2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int c=3;
		while(t>c)
		{
			t=t-c;
			c=c*2;
		}
		System.out.println(c-t+1);
		
	}

}
