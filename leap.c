#include<stdio.h>
#include<conio.h>
void main()
{
int a;
printf("enter the value");
scanf("%d",&a);
if(a%400==0 ||a%4==0 && a%100!=0)
printf("leap year");
else
printf("not leap year");
getch();
}
