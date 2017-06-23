/*
Assignment #5 Question No: 2
Name	: Jaideep CharaN
date	: 27/9/10
Object 	: WAP in JAVA which has a class Stack and use this 
	class in evaluating a postfix expression.Define appropriate constructors and methods.
*/

class Stack
{
	int t,a[];
	Stack()
	{
		t=-1;
		a=new int[10];
	}
	void push(int n)
	{
		t++;
		a[t]=n;		
	}
	int pop()
	{
		return(a[t--]);		
	}
}
class a5q1
{
	public static void main(String arg[])
	{
		int i,del,ch=0;
		del=Integer.parseInt(arg[0]);
		Stack ob=new Stack();
		for(i=10;i<29;i=i+2)
		{
			ob.push(i);
		}
		System.out.println("\tThe Stack is:\t\tStack Pop Process");
		for(i=9;i>=0;i--)
		{			
			if(ch<del)
			{
				System.out.print("\t|| "+ob.a[i]+" ||");
				System.out.println("\tDelete\t|| "+ob.pop()+" ||");
				ch++;
				System.out.println("\t--------\t\t--------");
			}
			else
			{
				System.out.println("\t|| "+ob.a[i]+" ||");
				System.out.println("\t--------");
			}			
		}		
		System.out.println("The Top is "+ob.t);
	}
}



/*
		Output


Z:\>java a5q1 4
        The Stack is:           Stack Pop Process
        || 28 ||        Delete  || 28 ||
        --------                --------
        || 26 ||        Delete  || 26 ||
        --------                --------
        || 24 ||        Delete  || 24 ||
        --------                --------
        || 22 ||        Delete  || 22 ||
        --------                --------
        || 20 ||
        --------
        || 18 ||
        --------
        || 16 ||
        --------
        || 14 ||
        --------
        || 12 ||
        --------
        || 10 ||
        --------
The Top is 5

*/
