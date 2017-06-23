/*
Assignment #4 Question No: 4 (iii)
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class for circle, which has 2 parameters radius and pie, 
	and methods for area and circumference of circle. 
	In main program calculate area and circumference for 
	circle object and also show the use of copy object. Using Constructor.
*/

class Circle
{
	private int rad;
	private double pie;
	double area()
	{
		return(pie*rad*rad);
	}
	double circumference()
	{
		return(2*pie*rad);
	}
	Circle ()
	{
	}
	Circle(int r,double p)
	{
		rad=r;
		pie=p;
	}
	Circle (Circle ob)
	{
		rad=ob.rad;
		pie=ob.pie;
	}
}
class a4q4iii
{
	public static void main(String arg[])
	{
		Circle ob1=new Circle(6,3.14);		
		System.out.println("The Area of Circle is:\t "+ob1.area());
		System.out.println("The Circumference of Circle is:\t "+ob1.circumference());
		System.out.println("Object Copy Process");
		Circle ob2=new Circle(ob1);
		System.out.println("The Value of Object 2 Area is "+ob2.area());
		System.out.println("Object Copied");
	}
}
	


/*

		Output


Z:\>java a4q4iii
The Area of Circle is:   113.03999999999999
The Circumference of Circle is:  37.68
Object Copy Process
The Value of Object 2 Area is 113.03999999999999
Object Copied

*/