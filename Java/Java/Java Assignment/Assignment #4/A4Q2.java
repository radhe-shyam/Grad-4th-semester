/*
Assignment #4 Question No: 2
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class for student which has members for rollno, name, 
	and marks of 3 subjects and has also methods for read, display and 
	calculate the percentage of the result. 
	Create its object in main program and display student record.
*/

class Student
{
	private int rno,sub1,sub2,sub3,tot;
	private String name;
	private float per;
	void read(int r,String na,int s1,int s2,int s3)
	{
		rno = r;name = na;sub1 = s1;
		sub2= s2;sub3=s3;
	}
	void display()
	{
		System.out.println("Roll No. :\t "+rno);
		System.out.println("Name : \t\t "+name);
		System.out.println("Subject 1:\t "+sub1);
		System.out.println("Subject 2:\t "+sub2);
		System.out.println("Subject 3:\t "+sub3);
		System.out.println("Total Marks is:\t "+tot);
		System.out.println("Percentage is:\t "+per);
		if (per>=60)
			System.out.println("Division:\t First");
		else if(per>=48)
			System.out.println("Division:\t Second");
		else if(per>=36)
			System.out.println("Division:\t Third");
		else
			System.out.println("Fail");
		System.out.print("\n");
	}
	void result()
	{
		tot=sub1+sub2+sub3;
		per=tot/3;
	}
}
class a4q2
{
	public static void main(String arg[])
	{
		Student ob1=new Student();
		Student ob2=new Student();
		Student ob3=new Student();
		ob1.read(101,"Ankit",55,65,50);
		ob2.read(102,"Dharmendra",85,95,75);
		ob3.read(103,"Jaideep",85,80,90);
		ob1.result();
		ob2.result();
		ob3.result();
		ob1.display();
		ob2.display();
		ob3.display();
	}
}

/*
		Output


Z:\>java a4q2
Roll No. :       101
Name :           Ankit
Subject 1:       55
Subject 2:       65
Subject 3:       50
Total Marks is:  170
Percentage is:   56.0
Division:        Second

Roll No. :       102
Name :           Dharmendra
Subject 1:       85
Subject 2:       95
Subject 3:       75
Total Marks is:  255
Percentage is:   85.0
Division:        First

Roll No. :       103
Name :           Jaideep
Subject 1:       85
Subject 2:       80
Subject 3:       90
Total Marks is:  255
Percentage is:   85.0
Division:        First


*/