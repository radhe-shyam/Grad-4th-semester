/*
Assignment #5 Question No: 5
Name	: Jaideep CharaN
date	: 27/9/10
Object 	:WAP in JAVA which create following inherit class structure.
*/
class Person
{
	private String name,address,city;
	void read(String na,String addr,String ci)
	{
		name=na;
		address=addr;
		city=ci;
	}
	void disp()
	{
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
		System.out.println("City :"+city);
	}
}
class Student extends Person
{
	private int rollno;
	void read(int ro,String na,String addr,String ci)
	{
		super.read(na,addr,ci);
		rollno=ro;
	}
	void disp()
	{
		super.disp();
		System.out.println("Roll No : "+rollno);
	}
}
class Exam extends Student
{
	private int marks;
	void read(int ma,int ro,String na,String addr,String ci)
	{
		super.read(ro,na,addr,ci);
		marks=ma;
	}
	void disp()
	{
		super.disp();
		System.out.println("Marks is: "+marks);
	}
}
class Employee extends Person
{
	private int empid;
	void read(int ei,String na,String addr,String ci)
	{
		super.read(na,addr,ci);
		empid=ei;
	}
	void disp()
	{
		super.disp();
		System.out.println("Emp Id is: "+empid);
	}
}
class Teaching extends Employee
{
	private String teasub;
	void read(String sub,int ei,String na,String addr,String ci)
	{
		super.read(ei,na,addr,ci);
		teasub=sub;
	}
	void disp()
	{
		super.disp();
		System.out.println("Teaching Subject is: "+teasub);
	}
}
class NonTeaching extends Employee
{
	private String nteasub;
	void read(String sub,int ei,String na,String addr,String ci)
	{
		super.read(ei,na,addr,ci);
		nteasub=sub;
	}
	void disp()
	{
		super.disp();
		System.out.println("Non Teaching Subject is: "+nteasub);
	}
}
class a5q5
{
	public static void main(String arg[])
	{
		Exam ob=new Exam();
		System.out.println("\nThis object create by Exam Class"); 
		ob.read(537,105,"Jaideep","Indra Colony","Nagaur");
		ob.disp();
		Teaching tob=new Teaching();
		System.out.println("\nThis object create by Teaching Class");
		tob.read("JAVA",101,"Amit Acharya","Housing Board","Jodhpur");
		tob.disp();
		NonTeaching ntob=new NonTeaching();
		System.out.println("\nThis object create by Non Teaching Class");
		ntob.read("Sports",102,"Anil Oza","Jalori Gate","Jodhpur");
		ntob.disp();
	}
}



/*
		Output
Z:\>java a5q5

This object create by Exam Class
Name :Jaideep
Address :Indra Colony
City :Nagaur
Roll No : 105
Marks is: 537

This object create by Teaching Class
Name :Amit Acharya
Address :Housing Board
City :Jodhpur
Emp Id is: 101
Teaching Subject is: JAVA

This object create by Non Teaching Class
Name :Anil Oza
Address :Jalori Gate
City :Jodhpur
Emp Id is: 102
Non Teaching Subject is: Sports

*/