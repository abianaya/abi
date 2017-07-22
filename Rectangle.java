package beginner;

import java.util.Scanner;

public class Rectangle {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("First rectangle left side x and y axis");
	int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    System.out.println("First rectangle right side x and y axis");
     int x2 = sc.nextInt();
    int  y2 = sc.nextInt();
    System.out.println("Second rectangle left side x and y axis");
    int  x3 = sc.nextInt();
    int  y3 = sc.nextInt();
    System.out.println("Second rectangle right side x and y axis");
    int  x4 = sc.nextInt();
    int   y4 = sc.nextInt();
     
     if(x3 > x2 || x4 < x1 || y3 > y2 || y4 < y1)
         System.out.println("Does not intersect");
     else
         System.out.println("Intersect");
}
}
