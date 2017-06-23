#include<iostream.h>
#include<conio.h>
void main()
{
  int i,sum=0,re,num;
  clrscr();
  cout<<"please enter number:-\n";
  cin>>num;
  re=num%1000;
  while(num>0)
  {
   sum=sum*10+re;
  }

  cout<<"revers of num is:-\n"<<sum;
  getch();
}