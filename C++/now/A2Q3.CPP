#include<iostream.h>
#include<conio.h>
class larg
{
	public:
	int large(int,int,int);
};
int larg::large(int a,int b, int c)
{
return ((a>b?(a>c?a:c):(b>c?b:c)));
}
void main()
{
clrscr();
larg obj;
int a,b,c;
cout<<"Enter 3 numbers : -";
cin>>a>>b>>c;
cout<<"The larger number is "<<obj.large(a,b,c);
getch();
}
