/*
Name:	Jaideep Charan
Date:	24 July, 2010
Object:	WAP in JAVA to check whether given number is palindrome or not.
*/

class a2q4
{
	public static void main(String arg[])
	{
		int d,num,rev=0,num1;
		num = Integer.parseInt(arg[0]);
		num1= Integer.parseInt(arg[0]);
		System.out.println("The Number is "+num);
		while(num>0)
		{
			d = num%10;
			rev = rev*10 + d;
			num = num/10;
		}
		if(rev==num1)
			System.out.print("The Number is palindrom");
		else
			System.out.print("The Number is not palindrom");
	}
}



/*

		Output


Z:\>java a2q4 125
The Number is 125
The Number is not palindrom
Z:\>java a2q4 121
The Number is 121
The Number is palindrom

*/
