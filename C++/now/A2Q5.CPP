#include<iostream.h>
#include<conio.h>
class fact
{
	public:
	int fa(int a);
};
int fact::fa(int a)
{
int sum=1;
for(int i=a;i>0;i--)
	sum=sum*i;
return sum;
}
void main()
{
clrscr();
fact obj;
int a;
cout<<"Enter the number : -";
cin>>a;
cout<<"Factorial of "<<a<<" is "<<obj.fa(a);
getch();
}