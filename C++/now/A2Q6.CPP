#include<iostream.h>
#include<conio.h>
class sum
{
	public:
	int sumof(int);
};
int sum::sumof(int a)
{
int s=0;
while(a!=0)
	{
	int b=a%10;
	s=s+b;
	a=a/10;
	}
return s;
}
void main()
{
clrscr();
int a;
sum obj;
cout<<"Enter any number : - ";
cin>>a;
cout<<"Sum of digits of "<<a<<" is "<<obj.sumof(a);
getch();
}
