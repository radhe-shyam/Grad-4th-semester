#include<iostream.h>
#include<conio.h>
class calci{
	public:
	int a,b;
	int add();
};
int calci::add(){
	return (a+b);
	}
void main()
{
calci o;
cout<<"Enter 2 numbers : -";
cin>>o.a>>o.b;
cout<<o.a<<"+"<<o.b<<"="<<o.add();
getch();
}