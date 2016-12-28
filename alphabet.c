#include<stdio.h>
#include<conio.h>
void main()
{
char a;
printf("enter the velue for a");
scanf("%c",&a);
if(a>='a'&&a<='z'||a>='A'&&a<='Z')
{
printf("alphabet is %c",a);;
}
else
{
printf("not");}
getch();
}
