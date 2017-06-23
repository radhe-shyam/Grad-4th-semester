/*
Assignment #4 Question No: 1
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class calculator which has two data members and arithmatic methods(+,-,*,/,%). 
	Use the object in main program and perform arithmatic operations.
*/


class Calculator
{
	private int x,y;
	void read(int a, int b)
	{
		x=a;
		y=b;
	}
	void addition()
	{		
		System.out.println("The Sum is: "+(x+y));
	}
	void subtraction()
	{
		System.out.println("The Subtraction is: "+(x-y));
	}
	void multiply()
	{
		System.out.println("The Multiply is: "+(x*y));
	}
	void division()
	{
		System.out.println("The Division is: "+(x/y));
	}
	void mode()
	{
		System.out.println("The Mode is: "+(x%y));
	}
}
class a4q1
{
	public static void main(String arg[])
	{
		Calculator ob1=new Calculator();
		int v1,v2;
		v1=Integer.parseInt(arg[0]);
		v2=Integer.parseInt(arg[1]);
		System.out.println("Value of X: "+v1);
		System.out.println("Value of Y: "+v2);
		ob1.read(v1,v2);
		ob1.addition();
		ob1.subtraction();
		ob1.multiply();
		ob1.division();
		ob1.mode();
	}
}





/*

		Output

Z:\>java a4q1 10 2
Value of X: 10
Value of Y: 2
The Sum is: 12
The Subtraction is: 8
The Multiply is: 20
The Division is: 5
The Mode is: 0

*/