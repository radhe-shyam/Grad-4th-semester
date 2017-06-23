/*
Assignment #5 Question No: 4
Name	: Jaideep CharaN
date	: 27/9/10
Object 	: WAP in JAVA which has a Person(abstract) class with read() and display() abstract methods and constructors of all types.
	Inherit it in Student and Teacher class and define the abstract methods
*/
import java.io.*;

abstract class Person
{
	int age;
	String name;
	Person()
	{
		age=21;
		name="JAIDEEP";
	}
	Person(int a,String b)
	{
		age=a;
		name=b;	
	}
	abstract void Read() throws IOException;
	abstract void Display();
}
class Student extends Person
{
	int roll;
	Student()
	{
		super();
		roll=265;
	}
	Student(int a,String n,int r)
	{
		super(a,n);
		roll=r;
	}
	void Read() throws IOException
	{
		System.out.println("Roll no of Student");
		BufferedReader dc=new BufferedReader(new InputStreamReader(System.in));
		roll=Integer.parseInt(dc.readLine());
	}
	void Display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Roll no.: "+roll);
	}
}
class Teacher extends Person
{
	String sub;
	Teacher()
	{	
		super();
		sub="English";
	}
	Teacher(int a,String n,String s)
	{
		super(a,n);
		sub=s;
	}
	void Read() throws IOException
	{
		System.out.println("Enter Subject of Teacher");
		BufferedReader dc=new BufferedReader(new InputStreamReader(System.in));
		sub=dc.readLine();
	}
	void Display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Subject: "+sub);
	}
}

class a5q4
{
	public static void main(String arg[])
	{
		Student s1=new Student();
		s1.Display();
		Student s2=new Student(21,"Dharmendra",266);
		s2.Display();
		Student s3=new Student();
		try
		{
			s3.Read();
		}
		catch(Exception e){}
		s3.Display();

		Teacher t1=new Teacher();
		s1.Display();
		Teacher t2=new Teacher(30,"Amit","JAVA");
		s2.Display();
		Teacher t3=new Teacher();
		try
		{
			t3.Read();
		}
		catch(Exception e){}
		t3.Display();  
	}
}


/*
		Output


Z:\>java a5q4
Name: JAIDEEP
Age: 21
Roll no.: 265
Name: Dharmendra
Age: 21
Roll no.: 266
Roll no of Student
266
Name: JAIDEEP
Age: 21
Roll no.: 266
Name: JAIDEEP
Age: 21
Roll no.: 265
Name: Dharmendra
Age: 21
Roll no.: 266
Enter Subject of Teacher
JAVA
Name: Amit
Age: 30
Subject: JAVA

*/

