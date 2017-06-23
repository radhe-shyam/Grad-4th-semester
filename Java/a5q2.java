//Assignment #5
//Designed to evaluate a postfix expression using stack class

class stack
	{
	int a[];
	int top;
	stack(int x)
		{
		a=new int[x];
		top=-1;
		}
	void push(int x)
		{
		if(top==a.length-1)
			{
			System.out.println("Stack is overflow");
			System.out.println("Program terminated due to less size of stack");
			return;
			}
		else
			{
			top++;
			a[top]=x;
			//System.out.println(a[top]+" Pushed at "+top);
			}
		}
	int pop()
		{
		if(top<0)
			System.out.println("Stack is underflow");
		else
			{
			//System.out.println("Pop = "+a[top]);
			top--;
			}
		return a[top+1];
		}
	void calc(String arg[])
		{
		char x;
		int r;
		int n=arg[0].length();
		for(byte i=0;i<n;i++)
			{
			x=arg[0].charAt(i);
			if((x>='0') && (x<='9'))
				{
				r=x-48;
				push(r);
				}
			else if(x=='+' && top>0)
				{
				int r1=pop();
				int r2=pop();
				push(r1+r2);	
				//System.out.println("Now top is "+top);			
				}
			else if(x=='-' && top>0)
				{
				int r1=pop();
				int r2=pop();
				push(r1-r2);	
				//System.out.println("Now top is "+top);
				}
			else if(x=='*' && top>0)
				{
				int r1=pop();
				int r2=pop();
				push(r1*r2);	
				//System.out.println("Now top is "+top);
				}
			else if(x=='/' && top>0)
				{
				int r1=pop();
				int r2=pop();
				push(r1/r2);	
				//System.out.println("Now top is "+top);
				}
			else
				{
				System.out.print("Invalid input");
				return;
				}			
			}
		System.out.println("Result is = "+a[top]);
		}
	}
class a5q2
	{
	public static void main(String arg[])
		{
		int n;
		stack s1=new stack(10);
		s1.calc(arg);
		}
	}

//Output: -
//Z:\Java>java a5q2 345+*
//Result is = 27