/*
Name:	Jaideep Charan
Date:	24 July, 2010
Object:	WAP in JAVA to calculate sum of digits of given numbers.
*/

class a2q3
{
	public static void main(String arg[])
	{
		int d,num,sum=0;
		num = Integer.parseInt(arg[0]);
		System.out.println("The Number is "+num);
		while(num>0)
		{
			d = num%10;
			sum = sum + d;
			num = num/10;
		}
		System.out.print("The Sum of Digit is "+sum);
	}
}


/*

		Output


Z:\>java a2q3 154
The Number is 154
The Sum of Digit is 10

*/