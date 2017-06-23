#include<iostream.h>
#include<conio.h>
class over
{
	public:
	int add(int,int);
	float add(int,float);
	float add(float,float);
};
int over::add(int a,int b)
{
return a+b;
}
float over::add(int a, float b)
{
return a+b;
}
float over::add(float a, float b)
{
return a+b;
}
void main()
{
clrscr();
over obj;
cout<<obj.add(5,5)<<"\n";
cout<<obj.add(5,10.10f)<<"\n";
cout<<obj.add(10.10f,20.10f)<<"\n";
getch();
}
