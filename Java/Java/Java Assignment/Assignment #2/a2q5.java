/*
Name:	Jaideep Charan
Date:	24 July, 2010
Object:	WAP in JAVA to print following pattern:
*****
****
***
**
*
**
***
****
*****

*/

class a2q5
{
	public static void main(String arg[])	
	{
		char c;
		int i,j;		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(i=2;i<=5;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

/*

		Output


Z:\>java a2q5
*****
****
***
**
*
**
***
****
*****

*/