#include<iostream.h>
#include<conio.h>
class reverse
{ public:
  int dig,n,r,rev,i;
  void getdata();
  void calculation();
  void display();
};
void reverse::getdata()
{
clrscr();
cout<<"enter the value of digit\n";
cin>>dig;
cout<<"enter the number\n";
cin>>n;
}
void reverse::calculation()
{
 rev=0;
 for(i=0;i<dig;i++)
 {
  r=n%10;
  rev=(rev*10)+r;
  n=n/10;
 }
}
void reverse::display()
{
  cout<<"reverse of given digit is\n"<<rev;
}
void main()
{
 reverse ob;
 ob.getdata();
 ob.calculation();
 ob.display();
 getch();

}
