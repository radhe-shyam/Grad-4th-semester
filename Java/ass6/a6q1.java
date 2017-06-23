//Assignment#6
//Designed to demonstrate packages
//Designed by Radhe shyam jangid
import stack.IntStack;
class A61
{
public static void main (String ar[])
{
IntStack ob=new IntStack();
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
Output:-
Z:\Java\ass6>java A61 243*+
14
*/