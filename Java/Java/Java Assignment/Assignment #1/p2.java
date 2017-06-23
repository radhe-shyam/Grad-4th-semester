/* 
Name:	Ganesh Kumar
Date:	23 july 2010
Object:	Program to find addition,subtraction,multiplication,division,mod.
*/

class p2
{
   	public static void main(String arg[])
   	{      
      		int a,b;
	      	a = Integer.parseInt(arg[0]);
	      	b = Integer.parseInt(arg[1]);
      		System.out.println("The sum of "+a+" & "+b+" is "+ (a+b));
      		System.out.println("The difference of "+a+" & "+b+" is "+ (a-b));
      		System.out.println("The multiplication of "+a+" & "+b+" is "+ (a*b));
      		System.out.println("The division  of "+a+" by "+b+" is "+ (a/b));
      		System.out.println("The mod of "+a+" & "+b+" is "+ (a%b));
   	}

}

/*

  		Output	

Z:\Java>java p2 10 2
The sum of 10 & 2 is 12
The difference of 10 & 2 is 8
The multiplication of 10 & 2 is 20
The division  of 10 by 2 is 5
The mod of 10 & 2 is 0

*/

