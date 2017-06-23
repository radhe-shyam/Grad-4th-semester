#include<iostream.h>
#include<conio.h>
class eo
{
	public:
	void evod(int);
};
void eo::evod(int a)
{
if(a%2==0)
	cout<<a<<" is even number";
else
	cout<<a<<" is odd number";
}
void main()
{
clrscr();
eo obj;
int a;
cout<<"Enter a number : -";
cin>>a;
obj.evod(a);
getch();
}