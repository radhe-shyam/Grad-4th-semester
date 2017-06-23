#include<conio.h>
#include<iostream.h>
void main()
{
int n,i,fact;
clrscr();
cout<<"Enter the number : - ";
cin>>n;
fact=1;
for(i=n;i>0;i--)
{
fact=fact*i;
}
cout<<"The factorial of "<<n<<" is = "<<fact;
getch();
}