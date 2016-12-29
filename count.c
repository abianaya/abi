#include<stdio.h>
#include<conio.h>
void main()
{
int count=0,r,n;
printf("enter the number");
scanf("%d",&n);
while(n!=0){
r=n%10;
n=n/10;
count++;
}
printf("the value is %d",count);
}
