#include<stdio.h>
#include<conio.h>
void main()
{
char a;
printf("enter the value");
scanf("%c",&a);
if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
printf("vowel");
else
printf("consonent");
getch();
}
