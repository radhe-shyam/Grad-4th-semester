//Assignment #4
//Designed to create a class for circle
//Designed by Radhe Shyam Jangid
//Date 13/9/2010
class circle
{	
	double pi,r;
	circle()
	{
	pi=3.14;
	r=3;
	}
	circle(double y)
	{
	pi=3.14;
	r=y;
	}
	circle(circle c1)
	{
	pi=c1.pi;
	r=c1.r;
	}
	void read(double y)
	{
	r=y;	
	}
	double area()
	{
	return(pi*(r*r));
	}
	double circum()
	{
	return(2*pi*r);
	}
}
class a4q3
{
	public static void main(String arg[])
	{
	circle c1=new circle();
	circle c2=new circle(6);
	circle c3=new circle(c1);
	System.out.println("Area = "+(c1.area()));
	System.out.println("Circumference = "+(c1.circum()));
	System.out.println("Area = "+(c2.area()));
	System.out.println("Circumference = "+(c2.circum()));
	System.out.println("Area = "+(c3.area()));
	System.out.println("Circumference = "+(c3.circum()));
	}
}
//Output: -
//Area = 28.26
//Circumference = 18.84
//Area = 113.04
//Circumference = 37.68
//Area = 28.26
//Circumference = 18.84