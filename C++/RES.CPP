#include<iostream.h>
#include<conio.h>
void main()
{
  int re,num;
  clrscr();
  cout<<"please enter number:-\n";
  cin>>num;

  while(num!=0)
  {re=num%10;

   cout<<"revers of num is:-\n"<<re<<"\n";
    num=num/10;
  }


  getch();
}