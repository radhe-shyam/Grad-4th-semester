/*
Assignment #4 Question No: 4 (ii)
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class for student which has members for rollno, name, 
	and marks of 3 subjects and has also methods for read, display and 
	calculate the percentage of the result. 
	Create its object in main program and display student record. Using Constructor
*/

class Student
{
	private int rno,sub1,sub2,sub3,tot;
	private String name;
	private float per;
	Student()
	{
		rno=0;name="";sub1=0;
		sub2=0;sub3=0;
	}
	Student(int r,String na,int s1,int s2,int s3)
	{
		rno = r;name = na;sub1 = s1;
		sub2= s2;sub3=s3;
	}
	Student(Student ob)
	{
		rno=ob.rno;name=ob.name;
		sub1=ob.sub1;sub2=ob.sub2;
		sub3=ob.sub3;tot=ob.tot;
		per=ob.per;
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
class a4q4ii
{
	public static void main(String arg[])
	{
		Student ob1=new Student(101,"Ajay",50,60,70);
		Student ob2=new Student(105,"Fahad",80,90,90);
		Student ob3=new Student(108,"Sushil",90,80,80);		
		ob1.result();
		ob2.result();
		ob3.result();
		ob1.display();
		ob2.display();
		ob3.display();
		System.out.println("Object Copy Process");
		Student ob4=new Student(ob1);
		ob4.display();
	}
}


/*

		Output


Z:\>java a4q4ii
Roll No. :       101
Name :           Ajay
Subject 1:       50
Subject 2:       60
Subject 3:       70
Total Marks is:  180
Percentage is:   60.0
Division:        First

Roll No. :       105
Name :           Fahad
Subject 1:       80
Subject 2:       90
Subject 3:       90
Total Marks is:  260
Percentage is:   86.0
Division:        First

Roll No. :       108
Name :           Sushil
Subject 1:       90
Subject 2:       80
Subject 3:       80
Total Marks is:  250
Percentage is:   83.0
Division:        First

Object Copy Process
Roll No. :       101
Name :           Ajay
Subject 1:       50
Subject 2:       60
Subject 3:       70
Total Marks is:  180
Percentage is:   60.0
Division:        First

*/
