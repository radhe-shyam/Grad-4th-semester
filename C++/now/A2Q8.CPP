#include<iostream.h>
#include<conio.h>
class p
{
	public:
	void prime(int);
};
void p::prime(int a)
{
int p=0;
for(int i=1;i<=a;i++)
	{
	if(a%i==0)
		p++;
	}
if(p<3)
	cout<<a<<" is prime number.";
else
	cout<<a<<" is not prime number.";
}
void main()
{
clrscr();
int a;
p obj;
cout<<"Enter the number : - ";
cin>>a;
obj.prime(a);
getch();
}