package SkillRack;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Words2 {
	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		
	
		String str=s.nextLine();
		StringTokenizer st=new StringTokenizer(str,".\n");
		
	while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
	}
}


