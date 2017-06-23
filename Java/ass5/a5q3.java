/*	Assignment 5 
Created by Ravi Joshi.
Q3=WAP in JAVA which has a class Shape.Inherit this class in Rectangle and Triangle and demonstrate dynamic method dispatch and overriding.*/
class shape
{
double hight,width;
shape(double a,double b)
{
hight = a;
width=b;
}
double val()
{
return 0;
}
}
class rectangle extends shape
{
rectangle (double a,double b)
{
super (a,b);
}
double val()
{
return hight*width;
}
}
class triangle extends shape
{
triangle (double a,double b)
{
super (a,b);
}
double val()
{
return (.5*hight*width);
}
}
class A53
{
public static void main (String ar[])
{
rectangle ob=new rectangle(5,2);
triangle ob1=new triangle(5,2);
System.out.println("area of Rectangle = "+ ob.val());
System.out.println("area of Triangle = "+ ob1.val());
}
}
/*
Output :-
area of Rectangle = 10.0
area of Triangle = 5.0
*/