#include<stdio.h>
#include<iostream.h>
#include<conio.h>
void main()
{
  int x,y,z;
  clrscr();
  cout<<"Enter the three no.:-\n";
  cin>>x>>y>>z;
  if(x>y && x>z)
  cout<<"The Largest no.is:-"<<x;
  if(y>x && y>z)
  cout<<"The Largest no.is:-"<<y;
  if(z>x && z>y)
  cout<<"The Largest no.is:-"<<z;
  if(x<y && x<z)
  cout<<"\nThe Smallest no.is:-"<<x;
  if(y<x && y<z)
  cout<<"\nThe Smallest no.is:-"<<y;
  if(z<x && z<y)
  cout<<"\nThe Smallest no.is:-"<<z;
  getch();
}