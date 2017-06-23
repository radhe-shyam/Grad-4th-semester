/*	Assignment 5 
Created by Vijay Arora.
Q1=WAP in JAVA which has a class Myclass which have methods fact(int),table(int) and define main and call those methods without creating the objects. 
*/
class Myclass
{
static void fact(int b)
{
int sum=1;
for(int i=1;i<=b;i++)
{
sum=sum*i;
}
System.out.println("Factorial is = "+sum);
}
static void table(int b)
{
System.out.println("Table of = " +b);
for(int i=1;i<=10;i++)
System.out.println((b*i));
}
}
class A51
{
public static void main (String ar[])
{
int b=Integer.parseInt(ar[0]);
Myclass.fact(b);
Myclass.table(b);
}
}
/*
Output :-
Z:\Java\ass5>java A50 5
Factorial is = 120
Table of = 5
5
10
15
20
25
30
35
40
45
50
*/