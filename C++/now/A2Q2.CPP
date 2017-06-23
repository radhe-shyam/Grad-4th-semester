#include<iostream.h>
#include<conio.h>
class simp{
	public:
	float sim(int, int, int);
};
float simp::sim(int p, int r, int t)
{
return ((p*r*t)/100);
}
void main()
{
clrscr();
simp obj;
int p,r,t;
cout<<"Enter the principle : - ";
cin>>p;
cout<<"Enter the rate : - ";
cin>>r;
cout<<"Enter the time : -";
cin>>t;
cout<<"Simple interest is "<<obj.sim(p,r,t);
getch();
}