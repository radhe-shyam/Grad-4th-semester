/*	Assignment 5 
Created by Ravi Joshi.
Q2=WAP in JAVA which has a class Stack and use this class in evaluating a postfix expression.
Define appropriate constructors and methods. 
*/
class A52
{
public static void main (String ar[])
{
stack ob=new stack();
int n=ar[0].length();
for(int i=0;i<n;i++)
{
char k=ar[0].charAt(i);
if(k>47 && k<58)
{
int b=k-48;
ob.push(b);
}
else if (k=='+')
{
int c=ob.pop();
int d=ob.pop();
int e=c+d;
ob.push(e);
}
else if (k=='-')
{
int c=ob.pop();
int d=ob.pop();
int e=c-d;
ob.push(e);
}
else if (k=='*')
{
int c=ob.pop();
int d=ob.pop();
int e=c*d;
ob.push(e);
}
else if (k=='/')
{
int c=ob.pop();
int d=ob.pop();
int e=c/d;
ob.push(e);
}
}
ob.display();
}
}
/*
Ouutput :-
Z:\Java\ass5>java A52 549+*
65
*/