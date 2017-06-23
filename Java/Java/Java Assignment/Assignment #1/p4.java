/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find given number is even or odd.
*/

class p4
{
   	public static void main(String arg[])
   	{       
      		int num;
      		num=Integer.parseInt(arg[0]);
      		if(num%2==0)
      			System.out.println("The enterd number is even");
      		else
      			System.out.println("The enterd number is odd");
    	}

}

/*
		Output

Z:\>java p4 12
The enterd number is even

Z:\>java p4 15
The enterd number is odd

*/


