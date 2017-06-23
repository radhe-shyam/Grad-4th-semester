/*
Assignment #5 Question No: 2
Name	: Jaideep CharaN
date	: 27/9/10
Object 	: WAP in JAVA which has a class Stack and use this 
	class in evaluating a postfix expression.Define appropriate constructors and methods.
*/
class postfix extends Stack
{
	int num,a,b;
	postfix()
	{
		super();		
	}
	void check(char n)
	{		
		int nu;
		nu=n-48;
		if(nu>=0 && nu<=9)
		{									
			push(nu);
		}
		else
		{
			a=pop();
			b=pop();
			if(n=='+')
				num=b+a;
			else if(n=='-')
				num=b-a;
			else if(n=='*')
				num=b*a;
			else if(n=='/')
				num=b/a;
			push(num);
		}			
	}
}
class a5q2
{
	public static void main(String arg[])
	{
		int i,l;
		char n;
		l=arg[0].length();
		postfix ob=new postfix();
		for(i=0;i<l;i++)
		{
			n=(arg[0].charAt(i));
			ob.check(n);
		}
		System.out.println("The Result is "+ob.num);
	}
}



/*
	Output


Z:\>java a5q2 65+
The Result is 11

Z:\>java a5q2 65-
The Result is 1

Z:\>java a5q2 65*5/2+
The Result is 8

*/