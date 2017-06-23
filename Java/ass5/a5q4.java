/*	Assignment 5 
Created by Vijay Arora.
Q4=WAP in JAVA which has a Person(abstract) class with read() and display() abstract methods and constructors of all types.Inherit it in Student and Teacher class and define the abstract methods. 
*/
abstract class person
{
String name,fname;
person (String a,String b)
{
name=a;
fname=b;
}
abstract void read ();
abstract void display();
}
class student extends person
{
String clas;
int rno,m1,m2,m3,m4,per;
student(String a,String b)
{
super(a,b);
}
void read()
{
rno=374;
clas="BCA-4";
m1=65;m2=85;m3=75;m4=66;
per=(m1+m2+m3+m4)/4;
}
void display()
{
System.out.println("Name :  "+name);
System.out.println("Father name :  "+fname);
System.out.println("Class :  "+clas);
System.out.println("Student Roll no :  "+rno);
System.out.println("Percentage is : "+per);
}
}
class teacher extends person
{
String degi;
double salary;
teacher(String a,String b)
{
super(a,b);
}
void read()
{
salary=25000;
degi="Teacher";
}
void display()
{
System.out.println("Name :  "+name);
System.out.println("Father name :  "+fname);
System.out.println("Employee (Teaching) is : "+degi);
System.out.println("Salary is : "+salary);
}
}
class A54
{
public static void main(String ar[])
{
student ob=new student("vijay","Rambabu Ji");
teacher ob1=new teacher("vijay","Rambabu Ji");
System.out.println("     Student   ");
ob.read();
ob.display();
System.out.println();
System.out.println("     Teacher   ");
ob1.read();
ob1.display();
}
}
/*
Output :-
     Student
Name :  vijay
Father name :  Rambabu Ji
Class :  BCA-4
Student Roll no :  374
Percentage is : 72

     Teacher
Name :  vijay
Father name :  Rambabu Ji
Employee (Teaching) is : Teacher
Salary is : 25000.0
*/