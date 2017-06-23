//Assignment #5
//Designed to create stack
//Designed by Radhe Shyam Jangid
//Date 21/9/2010
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
		if(top==9)
			System.out.println("Stack is overflow");
		else
			{
			top++;
			a[top]=x;
			System.out.println("Push = "+x);
			}
		}
	void pop()
		{
		if(top<0)
			System.out.println("Stack is underflow");
		else
			{
			System.out.println("Pop = "+a[top]);
			top--;
			}
		}
	}
class a5q1
	{
	public static void main(String arg[])
		{
		stack s1=new stack(10);
		for(byte i=0;i<11;i++)
		s1.push(i+5);
		for(byte i=9;i>-2;i--)
		s1.pop();
		}
	}

Output: -
//Z:\Java>java a5q1
//Push = 5
//Push = 6
//Push = 7
//Push = 8
//Push = 9
//Push = 10
//Push = 11
//Push = 12
//Push = 13
//Push = 14
//Stack is overflow
//Pop = 14
//Pop = 13
//Pop = 12
//Pop = 11
//Pop = 10
//Pop = 9
//Pop = 8
//Pop = 7
//Pop = 6
//Pop = 5
//Stack is underflow