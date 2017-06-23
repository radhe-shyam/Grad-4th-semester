#include<iostream.h>
#include<conio.h>
class alpha
{
int x;
public:
alpha(int i)
{
x=i;
cout<<"alpha initialized \n";
}
void show_x(void)
{
cout<<"x = "<<x<<"\n";
}
};
class beta
{
float y;
public:
beta(float j)
{
y=j;
cout<<"beta initialized \n";
}
void show_y(void)
{
cout<<"y = "<<y<<"\n";
}
};
class gamma:public beta, public alpha
{
int m, n;
public:
gamma(int a, float b, int c, int d): alpha(a), beta(b)
{
m=c;
n=d;
cout<<"gamma intialized \n";
}
void show_mn(void)
{
cout<<"m = "<<m<<"\n"<<"n = "<<n<<"\n";

}

};
void main()
{
clrscr();
gamma g(10,75,20,30);
cout<<"\n";
g.show_x();
g.show_y();
g.show_mn();
getch();
}