/*
Assignment #5 Question No: 1
Name	: Jaideep CharaN
date	: 27/9/10
Object 	:WAP in JAVA which has a class Stack and use this class in evaluating a postfix expression.
	Define appropriate constructors and methods.
*/

class MyClass
{
	static int fact(int x)
	{
		int fac=1;
		for(int i=1;i<=x;i++)
			fac*=i;
		return fac;
	}
	static void table(int x)
	{
		int temp;
		for(int i=1;i<=10;i++)
		{
			temp=i*x;
			System.out.println(i+" * "+x+" = \t"+temp);
		}
	}
}
class a5q1 extends MyClass
{
	public static void main(String arg[])
	{	
		int c;
		c=MyClass.fact(6);
		MyClass.table(8);
		System.out.println("Factorial       ="+ c);
		
	}
}

/*
		Output


Z:\>java a5q1
1 * 8 =         8
2 * 8 =         16
3 * 8 =         24
4 * 8 =         32
5 * 8 =         40
6 * 8 =         48
7 * 8 =         56
8 * 8 =         64
9 * 8 =         72
10 * 8 =        80
Factorial       =720

*/