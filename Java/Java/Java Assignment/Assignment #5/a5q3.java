/*
Assignment #5 Question No: 3
Name	: Jaideep CharaN
date	: 27/9/10
Object 	: WAP in JAVA which has a class Shape.Inherit this class in Rectangle 
	and Triangle and demonstrate dynamic method dispatch and overriding.
*/
class Shape
{
	int a,b;
	Shape()
	{
		a=15;
		b=9;	
	}
	Shape(int x)
	{
		a=b=x;
	}
	Shape(int x,int y)
	{
		a=x;
		b=y;
	}
	int area()
	{
		return a*b;
	}
}

class Rect extends Shape
{
	Rect()
	{
		super();
	}
	Rect(int x)
	{
		super(x);
	}
	Rect(int x,int y)
	{
		super(x,y);
	}
	int area()
	{
		int data=super.area();
		return data;
	}	
}
class Trian extends Shape
{
	Trian()
	{
		super();
	}
	Trian(int x)
	{
		super(x);
	}
	Trian(int x,int y)
	{
		super(x,y);
	}
	int area()
	{
		int data=super.area();
		return data/2;
	}	
}
class a5q3
{
	public static void main(String arg[])
	{
		Shape ref;
		Rect r1=new Rect();
		ref=r1;
		int re=ref.area();
		System.out.println("Area of Rectangal: "+re);
		Trian r2=new Trian();
		ref=r2;
		int tr=ref.area();
		System.out.println("Area of Triangle: "+tr);
	}
}

/*
		Output


Z:\>java a5q3
Area of Rectangal: 135
Area of Triangle: 67

*/