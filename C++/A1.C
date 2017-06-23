#include<stdio.h>
#include<conio.h>
void main()
{
int n,d1,d2,d3,sum;
clrscr();
printf("enter a three digit no \n");
scanf("%3d",&n);
d1=n%10;
n=n/10;
d2=n%10;
n=n/10;
d3=n%10;
sum=d1+d3;
printf(" the sum of first and last digit is %d",sum);
getch();
}