#include<stdio.h>
#include<conio.h>
void main()
{
int fact=1,i,n;
printf("enter the factorial number");
scanf("%d",&n);
for(i=1;i<=n;i++)
{
fact=fact*i;
}
printf("the factorial numbrr  is %d",fact);
}
