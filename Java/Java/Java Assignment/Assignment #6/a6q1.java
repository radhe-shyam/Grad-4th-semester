/*
Assignment #6 Question No: 1
Name	: Jaideep CharaN
date	: 25/10/10
Object 	: Create a two classes IntStack and CharStack into a package Stack. 
	Demonstrate both classes outside this package.
*/

import stack.IntStack;
class a6q1
{
	public static void main (String ar[])
	{
		IntStack ob=new IntStack();
		int n=ar[0].length();
		for(int i=0;i<n;i++)
		{
			char k=ar[0].charAt(i);
			if(k>47 && k<58)
			{
				int b=k-48;
				ob.push(b);
			}
			else if (k=='+')
			{
				int c=ob.pop();
				int d=ob.pop();
				int e=c+d;
				ob.push(e);
			}
			else if (k=='-')
			{
				int c=ob.pop();
				int d=ob.pop();
				int e=c-d;
				ob.push(e);
			}
			else if (k=='*')
			{
				int c=ob.pop();
				int d=ob.pop();
				int e=c*d;
				ob.push(e);
			}
			else if (k=='/')
			{
				int c=ob.pop();
				int d=ob.pop();
				int e=c/d;
				ob.push(e);
			}
		}
			ob.display();
	}
}
/*
	Output

Z:\>java a6q1 65+
11

Z:\>java a6q1 46+5+
15

*/