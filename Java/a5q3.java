//Assignment #5
//Designed to demonstrate dynamic method dispatch and overriding. 
//Designed by Radhe Shyam Jangid
//Date 10/10/2010
class shape
{
	int a,b;
	shape(int c,int d)
	{
	a=c;
	b=d;
	}
	void area()
	{
	System.out.println("No area");
	}

	
}
class rectangle extends shape
{
	rectangle(int c, int d)
		{
		super(c,d);	
		}
	void area()
		{
		System.out.println("Area of Rectangle = "+(a*b));
		}		
}
class triangle extends rectangle
{
	triangle(int c, int d)
		{
		super(c,d);	
		}
	void area()
		{
		System.out.println("Area of Triangle = "+((a*b)/2));
		}
}
class a5q3
{
public static void main(String arg[])
	{
	rectangle r=new rectangle(5,10);
	triangle t=new triangle(12,14);
	shape s;
	s=r;
	s.area();
	s=t;
	s.area();
	}
}

//Output: -
//Z:\Java>java a5q3
//Area of Rectangle = 50
//Area of Triangle = 84
