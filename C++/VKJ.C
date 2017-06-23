#include<stdio.h>
#include<conio.h>
void main()
{
int r,j,rows;
clrscr();
printf("enter the number of rows=");
scanf("%d",&rows);
fflush(stdin);
for(r=1; r<=rows; r++)
{
for(j=1; j<=r; j++)
putchar('*');
printf("\n");
}
getch();
}