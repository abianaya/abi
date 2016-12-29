#include<stdio.h>
#include<conio.h>
void main()
{
int i=1,n,sum=0;
printf("enter the number");
scanf("%d",&n);
while(i<=n)
{
sum+=i;
++i;}
printf("the value is %d",sum);
}
