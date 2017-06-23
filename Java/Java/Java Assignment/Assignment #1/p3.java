/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find greatest among two number.
*/

class p3
{
   	public static void main(String arg[])
   	{       
      		int a,b;
      		a=Integer.parseInt(arg[0]);
      		b=Integer.parseInt(arg[1]);
      		System.out.println("The first number is....  "+a);
      		System.out.println("The second number is....  "+b);
      		if(a>b)
      			System.out.println("The greatest among these two is... "+a);
      		else
      			System.out.println("The greatest among these two is... "+b);
   	}

}

/*

     		Output

Z:\>java p3 10 5
The first number is....  10
The second number is....  5
The greatest among these two is... 10


*/

