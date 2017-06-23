/*
Assignment #4 Question No: 3
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class for circle, which has 2 parameters radius and pie, 
	and methods for area and circumference of circle. 
	In main program calculate area and circumference for 
	circle object and also show the use of copy object.
*/

class Circle
{
	private int rad;
	private double pie;
	void read(int r,double p)
	{
		rad=r;
		pie=p;
	}
	double area()
	{
		return(pie*rad*rad);
	}
	double circumference()
	{
		return(2*pie*rad);
	}
}
class a4q3
{
	public static void main(String arg[])
	{
		Circle ob1=new Circle();
		ob1.read(Integer.parseInt(arg[0]),3.14);
		System.out.println("The Area of Circle is:\t "+ob1.area());
		System.out.println("The Circumference of Circle is:\t "+ob1.circumference());
		Circle ob2;
		ob2=ob1;
		ob2.read(4,3.14);	
		System.out.println("The Value of Object 2 Radian is = 4");	
		System.out.println("The Value of Object 1 Area is "+ob1.area());
	}
}
	


/*

		Output


Z:\>java a4q3 7
The Area of Circle is:   153.86
The Circumference of Circle is:  43.96
The Value of Object 2 Radian is = 4
The Value of Object 1 Area is 50.24

*/