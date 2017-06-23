/*
Assignment #6 Question No: 2
Name	: Jaideep CharaN
date	: 25/10/10
Object 	: WAP in JAVA to demonstrate Exception handling for ArrayIndexOutOfBoundsException, 
	ArithmaticException and Exception class.
*/

class a6q2
{
	public static void main(String arg[])
	{
		try
		{
			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			int c=a/b;
			System.out.println("The Result is "+c);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Please give two correct value");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Value is divided by zero OR Not a Correct value");
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}
}

/*
		Output


Z:\>java a6q2 10 2
The Result is 5

Z:\>java a6q2 10
Please give two correct value

Z:\>java a6q2 5 0
Value is divided by zero OR Not a Correct value

*/