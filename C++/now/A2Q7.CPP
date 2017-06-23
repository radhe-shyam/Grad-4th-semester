#include<iostream.h>
#include<conio.h>
class rev
{
	public:
	long reve(long);
};
long rev::reve(long a)
{
long r=0;
while(a!=0)
	{
	int b=a%10;
	r=(r*10)+b;
	a=a/10;
	}
return r;
}
void main()
{
clrscr();
long a;
rev obj;
cout<<"Enter the number : - ";
cin>>a;
cout<<"Reverse of "<<a<<" is "<<obj.reve(a);
getch();
}