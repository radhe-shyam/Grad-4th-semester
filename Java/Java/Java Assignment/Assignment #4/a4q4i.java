/*
Assignment #4 Question No: 4 (i)
Name	: Jaideep Charan
date	: 6/9/10
Object 	:Define a class calculator which has two data members and arithmatic methods(+,-,*,/,%). 
	Use the object in main program and perform arithmatic operations. Using Constructor.
*/


class Calculator
{
	int x,y;
	Calculator()
	{
		x=0;
		y=0;
	}
	Calculator(int a, int b)
	{
		x=a;
		y=b;
	}
	Calculator(Calculator ob)
	{
		x=ob.x;
		y=ob.y;
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
class a4q4i
{
	public static void main(String arg[])
	{
		Calculator ob1=new Calculator(15,3);		
		System.out.println("Value of X: "+ob1.x);
		System.out.println("Value of Y: "+ob1.y);
		ob1.addition();
		ob1.subtraction();
		ob1.multiply();
		ob1.division();
		ob1.mode();
		System.out.println("Object Copy Process");
		Calculator ob2=new Calculator(ob1);
		ob2.addition();
		ob2.division();
		System.out.println("Object Copied");
	}
}



/*
		Output

Z:\>java a4q4i
Value of X: 15
Value of Y: 3
The Sum is: 18
The Subtraction is: 12
The Multiply is: 45
The Division is: 5
The Mode is: 0
Object Copy Process
The Sum is: 18
The Division is: 5
Object Copied

*/
