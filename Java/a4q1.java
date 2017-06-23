//Assignment #4
//Designed to create a class calculator
//Designed by Radhe Shyam Jangid
//Date 6/9/2010
class calculator
{
	int a,b;
	calculator()
	{
	a=5;
	b=7;
	}
	int add()
	{
	return(a+b);
	}
	int sub()
	{
	return(a-b);
	}
	int mul()
	{
	return(a*b);
	}
	int div()
	{
	return(a/b);
	}
	int mod()
	{
	return(a%b);
	}
}
class a4q1
{
	public static void main(String arg[])
	{
	calculator rdj=new calculator();
	System.out.println("Addition = "+(rdj.add()));
	System.out.println("Subtraction = "+(rdj.sub()));
	System.out.println("Multiplication = "+(rdj.mul()));
	System.out.println("Division = "+(rdj.div()));
	System.out.println("Mod = "+(rdj.mod()));
	}
}

//Output: -

//Z:\Java>java a4q1
//Addition = 12
//Subtraction = -2
//Multiplication = 35
//Division = 0
//Mod = 5