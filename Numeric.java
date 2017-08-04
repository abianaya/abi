package SkillRack;

import java.util.Scanner;

public class Numeric {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		char[]ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
				{
			if(ch[i]>=48 && ch[i]<=57)
			{
				count++;
			}
				}
		System.out.println(count);
	}
	}


